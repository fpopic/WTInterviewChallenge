package com.waytation.datasource

import com.waytation.model.{Signal, Station, Tag, Zone}
import org.apache.spark.sql.Dataset

trait DatasourceReader {

  def getSignals: Dataset[Signal]

  def getTags: Dataset[Tag]

  def getStations: Dataset[Station]

  def getZones: Dataset[Zone]

}