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
package com.axelor.apps.businessproject.service;

import com.axelor.apps.businessproject.db.ProjectFolder;
import com.axelor.exception.AxelorException;
import java.io.IOException;

public interface ProjectFolderService {

  String printProjectsPlanificationAndCost(ProjectFolder projectFolder)
      throws IOException, AxelorException;

  String printProjectFinancialReport(ProjectFolder projectFolder)
      throws IOException, AxelorException;
}
