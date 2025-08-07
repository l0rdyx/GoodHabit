package org.glebkrasnopolin.goodhabit

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import models.Logs
import org.koin.dsl.module
import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()

internal actual val platformModule = module {
    single<SqlDriver> {
        NativeSqliteDriver(Logs.Schema, "log.db")
    }
}