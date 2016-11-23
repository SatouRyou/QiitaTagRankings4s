package domain.vo

import argonaut.CodecJson
import httpz.JsonToString

/**
  * Created by teradashoutarou on 2016/11/23.
  */
inal case class Tag(
                     followersCount :Long,
                     iconUrl        :Option[String],
                     id             :String,
                     itemsCount     :Long
                   ) extends JsonToString[Tag]

object Tag {

  implicit val tagCodecJson: CodecJson[Tag] =
    CodecJson.casecodec4(apply, unapply)(
      "followers_count",
      "icon_url",
      "id",
      "items_count"
    )
}