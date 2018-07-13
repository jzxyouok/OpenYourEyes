package cc.shinichi.openyoureyes.ui.holder

import android.widget.TextView
import cc.shinichi.openyoureyes.R
import cc.shinichi.openyoureyes.model.entity.HomeDataEntity
import cc.shinichi.openyoureyes.util.UIUtil
import cc.shinichi.openyoureyes.util.image.ImageLoader
import com.chad.library.adapter.base.BaseViewHolder
import com.facebook.drawee.view.SimpleDraweeView

class VideoSmallCard {

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

    val img_videoSmallCard_img = helper.getView<SimpleDraweeView>(R.id.img_videoSmallCard_img)
    val tv_videosmallcard_time_length = helper.getView<TextView>(R.id.tv_videosmallcard_time_length)

    val tv_videosmallcard_title = helper.getView<TextView>(R.id.tv_videosmallcard_title)
    val tv_videosmallcard_des = helper.getView<TextView>(R.id.tv_videosmallcard_des)

    ImageLoader.load(data.cover?.feed, img_videoSmallCard_img)
    tv_videosmallcard_time_length.text = UIUtil.getDurationText(data.duration)
    tv_videosmallcard_title.text = data.title
    tv_videosmallcard_des.text = "#" + data.category + " / " + data.author?.name
  }
}