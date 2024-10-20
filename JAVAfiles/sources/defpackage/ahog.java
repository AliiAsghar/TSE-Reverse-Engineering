package defpackage;

import android.content.Context;
import android.util.ArrayMap;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahog implements Window$OnFrameMetricsAvailableListener {
    private boolean a;
    private long b;
    private ahor c;
    private final ArrayMap d;
    private final alhr e;
    private final armf f;

    public ahog(Context context, ArrayMap arrayMap, armf armfVar) {
        this.e = albo.D(new agud(context, 14));
        this.d = arrayMap;
        this.f = armfVar;
    }

    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        long metric;
        long metric2;
        long j;
        long metric3;
        char c;
        int i2;
        int i3;
        int i4;
        ahor ahorVar;
        if (!this.a) {
            this.a = true;
            if (ahor.b()) {
                ahorVar = new ahor();
            } else {
                ahorVar = null;
            }
            this.c = ahorVar;
            if (this.f.b() != null && ((Boolean) this.f.b()).booleanValue()) {
                this.b = 1.0E9f / window.getWindowManager().getDefaultDisplay().getRefreshRate();
            } else {
                this.b = ((Long) this.e.get()).longValue();
            }
        }
        metric = frameMetrics.getMetric(9);
        if (metric != 1) {
            metric2 = frameMetrics.getMetric(8);
            ahor ahorVar2 = this.c;
            if (ahorVar2 != null) {
                j = ahorVar2.a(frameMetrics, this.b);
            } else {
                j = this.b;
            }
            metric3 = frameMetrics.getMetric(13);
            ArrayMap arrayMap = this.d;
            synchronized (arrayMap) {
                int size = arrayMap.size();
                int i5 = 0;
                while (i5 < size) {
                    ahoi ahoiVar = (ahoi) arrayMap.valueAt(i5);
                    int i6 = i5;
                    int i7 = (int) (metric2 / 1000000);
                    if (i7 < 0) {
                        ((alvg) ((alvg) ahkh.a.f()).h("com/google/android/libraries/performance/primes/metrics/jank/FrameTimeHistogram", "addFrame", 84, "FrameTimeHistogram.java")).s("Invalid frame time: %d", metric2);
                        ahoiVar.j++;
                        c = '\b';
                    } else {
                        ahoiVar.i++;
                        if (metric3 > 0) {
                            int i8 = (int) ((metric2 - metric3) / 1000000);
                            if (ahoiVar.o < i8) {
                                ahoiVar.o = i8;
                            }
                            int[] iArr = ahoiVar.f;
                            if (i8 < 20) {
                                if (i8 >= -20) {
                                    i3 = ((i8 + 20) >> 1) + 12;
                                } else if (i8 >= -30) {
                                    i3 = ((i8 + 30) / 5) + 10;
                                } else if (i8 >= -100) {
                                    i3 = ((i8 + 100) / 10) + 3;
                                } else if (i8 >= -200) {
                                    i3 = ((i8 + BasePaymentResult.ERROR_REQUEST_FAILED) / 50) + 1;
                                } else {
                                    i3 = 0;
                                }
                            } else {
                                if (i8 < 30) {
                                    i4 = ((i8 - 20) / 5) + 32;
                                } else if (i8 < 100) {
                                    i3 = ((i8 - 30) / 10) + 34;
                                } else if (i8 < 200) {
                                    i4 = ((i8 - 50) / 100) + 41;
                                } else if (i8 < 1000) {
                                    i3 = ((i8 - 200) / 100) + 43;
                                } else {
                                    i3 = 51;
                                }
                                i3 = i4;
                            }
                            iArr[i3] = iArr[i3] + 1;
                            if (metric2 > metric3) {
                                ahoiVar.g++;
                                ahoiVar.l += i7;
                            }
                            if (metric2 > j) {
                                ahoiVar.h++;
                                ahoiVar.m += i7;
                            }
                        } else if (metric2 > j) {
                            ahoiVar.g++;
                            ahoiVar.l += i7;
                        }
                        int[] iArr2 = ahoiVar.e;
                        if (i7 <= 20) {
                            c = '\b';
                            if (i7 >= 8) {
                                i2 = (i7 >> 1) - 2;
                            } else {
                                i2 = i7 / 4;
                            }
                        } else {
                            c = '\b';
                            if (i7 <= 30) {
                                i2 = (i7 / 5) + 4;
                            } else if (i7 <= 100) {
                                i2 = (i7 / 10) + 7;
                            } else if (i7 <= 200) {
                                i2 = (i7 / 50) + 15;
                            } else if (i7 <= 1000) {
                                i2 = (i7 / 100) + 17;
                            } else {
                                i2 = 27;
                            }
                        }
                        iArr2[i2] = iArr2[i2] + 1;
                        ahoiVar.j += i;
                        if (ahoiVar.k < i7) {
                            ahoiVar.k = i7;
                        }
                        ahoiVar.n += i7;
                    }
                    i5 = i6 + 1;
                }
            }
            return;
        }
        ahor ahorVar3 = this.c;
        if (ahorVar3 != null) {
            ahorVar3.a(frameMetrics, this.b);
        }
    }
}
