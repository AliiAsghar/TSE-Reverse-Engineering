package com.google.android.libraries.performance.primes.metrics.storage;

import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageStats;
import defpackage.ahkh;
import defpackage.alvg;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class PackageStatsCapture$PackageStatsCallback extends IPackageStatsObserver.Stub {
    private final Semaphore a = new Semaphore(1);
    private volatile PackageStats b;

    private PackageStatsCapture$PackageStatsCallback() {
    }

    public void onGetStatsCompleted(PackageStats packageStats, boolean z) {
        if (z) {
            ((alvg) ((alvg) ahkh.a.d()).h("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsCallback", "onGetStatsCompleted", 50, "PackageStatsCapture.java")).t("Success getting PackageStats: %s", packageStats);
            this.b = packageStats;
        } else {
            ((alvg) ((alvg) ahkh.a.i()).h("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsCallback", "onGetStatsCompleted", 53, "PackageStatsCapture.java")).q("Failure getting PackageStats");
        }
        this.a.release();
    }
}
