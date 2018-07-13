package cc.shinichi.openyoureyes.ui.holder

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.PagerSnapHelper
import android.support.v7.widget.RecyclerView
import android.widget.TextView
import cc.shinichi.openyoureyes.R
import cc.shinichi.openyoureyes.model.entity.HomeDataEntity
import cc.shinichi.openyoureyes.ui.adapter.HorRvAdapter
import cc.shinichi.openyoureyes.util.image.ImageLoader
import cc.shinichi.openyoureyes.widget.decoration.HorRvDecoration
import com.chad.library.adapter.base.BaseViewHolder
import com.facebook.drawee.view.SimpleDraweeView

class VideoCollectionWithBrief {

  private var helper: BaseViewHolder
  private var entity: HomeDataEntity

  constructor(
    helper: BaseViewHolder,
    entity: HomeDataEntity
  ) {
    this.entity = entity
    this.helper = helper
    setData()
  }

  private fun setData() {
    val data = entity.getData()?.data ?: return

    val img_category_icon = helper.getView<SimpleDraweeView>(R.id.img_category_icon)
    val tv_category_name = helper.getView<TextView>(R.id.tv_category_name)
    val tv_category_des = helper.getView<TextView>(R.id.tv_category_des)

    tv_category_name.text = data.header?.title
    tv_category_des.text = data.header?.description
    ImageLoader.load(data.header?.icon, img_category_icon)

    val recyclerView = helper.getView<RecyclerView>(R.id.rv_horizontalScrollCard)
    val manager = LinearLayoutManager(recyclerView.context)
    manager.orientation = LinearLayoutManager.HORIZONTAL
    recyclerView.layoutManager = manager
    recyclerView.onFlingListener = null
    val snapHelper = PagerSnapHelper()
    snapHelper.attachToRecyclerView(recyclerView)
    val adapter = HorRvAdapter(recyclerView.context, entity.getData()?.data?.itemList)
    recyclerView.adapter = adapter
    val decoration = HorRvDecoration(adapter.itemCount)
    val decorationCount = recyclerView.itemDecorationCount
    if (decorationCount > 0) {
      for (i in 0 until decorationCount) {
        recyclerView.removeItemDecorationAt(i)
      }
    }
    recyclerView.addItemDecoration(decoration)
  }
}