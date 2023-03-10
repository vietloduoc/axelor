/*
 * Axelor Business Solutions
 *
 * Copyright (C) 2023 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.axelor.apps.base.db.repo;

import com.axelor.apps.base.db.DataBackup;

public class DataBackupManagementRepository extends DataBackupRepository {

  @Override
  public DataBackup copy(DataBackup entity, boolean deep) {
    DataBackup copy = super.copy(entity, deep);

    copy.setStatusSelect(DATA_BACKUP_STATUS_DRAFT);
    copy.setBackupMetaFile(null);
    copy.setBackupDate(null);
    copy.setLogMetaFile(null);

    return copy;
  }
}
