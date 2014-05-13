/*
 * Copyright (C) 2014 Simon Vig Therkildsen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.simonvt.schematic.samples.database;

import net.simonvt.schematic.annotation.DataType;
import net.simonvt.schematic.annotation.References;

import static net.simonvt.schematic.annotation.DataType.Type.INTEGER;
import static net.simonvt.schematic.annotation.DataType.Type.TEXT;

public class MoreData {

  @DataType(INTEGER) public static final String _ID = "_id";

  @DataType(INTEGER) @References(table = MyDatabase.DATA, column = DataColumns._ID)
  public static final String REF = "ref";

  @DataType(TEXT) public static final String TITLE = "moreTitles";

  @DataType(TEXT) public static final String SUBTITLE = "moreSubtitles";
}