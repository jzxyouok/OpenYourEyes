package cc.shinichi.openyoureyes.model.bean.home

import com.google.gson.annotations.SerializedName

data class DataX(
  @SerializedName("dynamicType") val dynamicType: String? = "",
  @SerializedName("user") val user: User? = User(),
  @SerializedName("mergeNickName") val mergeNickName: Any? = Any(),
  @SerializedName("mergeSubTitle") val mergeSubTitle: Any? = Any(),
  @SerializedName("merge") val merge: Boolean? = false,
  @SerializedName("createDate") val createDate: Long? = 0,
  @SerializedName("simpleVideo") val simpleVideo: SimpleVideo? = SimpleVideo(),
  @SerializedName("reply") val reply: Reply? = Reply(),
  @SerializedName("id") val id: Int? = 0,
  @SerializedName("text") val text: String? = "",
  @SerializedName("subTitle") val subTitle: Any? = Any(),
  @SerializedName("actionUrl") val actionUrl: String? = "",
  @SerializedName("follow") val follow: Any? = Any(),
  @SerializedName("header") val header: Header? = Header(),
  @SerializedName("dataType") val dataType: String? = "",
  @SerializedName("title") val title: String? = "",
  @SerializedName("description") val description: String? = "",
  @SerializedName("library") val library: String? = "",
  @SerializedName("tags") val tags: List<Tag?>? = listOf(),
  @SerializedName("consumption") val consumption: Consumption? = Consumption(),
  @SerializedName("resourceType") val resourceType: String? = "",
  @SerializedName("slogan") val slogan: String? = "",
  @SerializedName("provider") val provider: Provider? = Provider(),
  @SerializedName("category") val category: String? = "",
  @SerializedName("author") val author: Author? = Author(),
  @SerializedName("cover") val cover: Cover? = Cover(),
  @SerializedName("playUrl") val playUrl: String? = "",
  @SerializedName("thumbPlayUrl") val thumbPlayUrl: Any? = Any(),
  @SerializedName("duration") val duration: Int? = 0,
  @SerializedName("webUrl") val webUrl: WebUrl? = WebUrl(),
  @SerializedName("releaseTime") val releaseTime: Long? = 0,
  @SerializedName("playInfo") val playInfo: List<PlayInfo?>? = listOf(),
  @SerializedName("campaign") val campaign: Any? = Any(),
  @SerializedName("waterMarks") val waterMarks: Any? = Any(),
  @SerializedName("adTrack") val adTrack: Any? = Any(),
  @SerializedName("type") val type: String? = "",
  @SerializedName("titlePgc") val titlePgc: String? = "",
  @SerializedName("descriptionPgc") val descriptionPgc: String? = "",
  @SerializedName("remark") val remark: String? = "",
  @SerializedName("ifLimitVideo") val ifLimitVideo: Boolean? = false,
  @SerializedName("searchWeight") val searchWeight: Int? = 0,
  @SerializedName("idx") val idx: Int? = 0,
  @SerializedName("shareAdTrack") val shareAdTrack: Any? = Any(),
  @SerializedName("favoriteAdTrack") val favoriteAdTrack: Any? = Any(),
  @SerializedName("webAdTrack") val webAdTrack: Any? = Any(),
  @SerializedName("date") val date: Long? = 0,
  @SerializedName("promotion") val promotion: Any? = Any(),
  @SerializedName("label") val label: Any? = Any(),
  @SerializedName("labelList") val labelList: List<Any?>? = listOf(),
  @SerializedName("descriptionEditor") val descriptionEditor: String? = "",
  @SerializedName("collected") val collected: Boolean? = false,
  @SerializedName("played") val played: Boolean? = false,
  @SerializedName("subtitles") val subtitles: List<Any?>? = listOf(),
  @SerializedName("lastViewTime") val lastViewTime: Any? = Any(),
  @SerializedName("playlists") val playlists: Any? = Any(),
  @SerializedName("src") val src: Any? = Any()
)