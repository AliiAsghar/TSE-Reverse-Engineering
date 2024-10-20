package defpackage;

import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaui {
    static final uuf a = uuh.q(188246326);
    static final ampd b;
    public static final /* synthetic */ int c = 0;

    static {
        aozy createBuilder = ampd.a.createBuilder();
        aozy createBuilder2 = ampy.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ampy ampyVar = (ampy) createBuilder2.b;
        ampyVar.i = 3;
        ampyVar.b |= 64;
        ampy ampyVar2 = (ampy) createBuilder2.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ampd ampdVar = (ampd) createBuilder.b;
        ampyVar2.getClass();
        ampdVar.c = ampyVar2;
        ampdVar.b |= 1;
        b = (ampd) createBuilder.s();
    }

    public static long a(long j, int i) {
        return i * Math.round(j / i);
    }

    public static void b(ameb amebVar) {
        throw new IllegalArgumentException("Invalid source, number representation: " + amebVar.a());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0073, code lost:
    
        if (r6.equals("sticker") != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.net.Uri r6, defpackage.aozy r7) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaui.c(android.net.Uri, aozy):void");
    }

    public static void d(aozy aozyVar, long j) {
        aozy createBuilder = amor.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amor amorVar = (amor) createBuilder.b;
        amorVar.b |= 1;
        amorVar.c = (int) (j / 1000);
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amoq amoqVar = (amoq) aozyVar.b;
        amor amorVar2 = (amor) createBuilder.s();
        amoq amoqVar2 = amoq.a;
        amorVar2.getClass();
        amoqVar.f = amorVar2;
        amoqVar.e = 207;
    }

    public static void e(aozy aozyVar, aozy aozyVar2, long j, ampy ampyVar) {
        if (j > 0) {
            long j2 = j / 1000;
            if (!aozyVar2.b.isMutable()) {
                aozyVar2.u();
            }
            ampm ampmVar = (ampm) aozyVar2.b;
            ampm ampmVar2 = ampm.a;
            ampmVar.b |= 16;
            ampmVar.h = (int) j2;
        }
        if (ampyVar != null) {
            aozy createBuilder = ampd.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ampd ampdVar = (ampd) createBuilder.b;
            ampdVar.c = ampyVar;
            ampdVar.b |= 1;
            if (!aozyVar2.b.isMutable()) {
                aozyVar2.u();
            }
            ampm ampmVar3 = (ampm) aozyVar2.b;
            ampd ampdVar2 = (ampd) createBuilder.s();
            ampm ampmVar4 = ampm.a;
            ampdVar2.getClass();
            ampmVar3.d = ampdVar2;
            ampmVar3.c = 101;
        } else {
            ampd ampdVar3 = ampd.a;
            if (!aozyVar2.b.isMutable()) {
                aozyVar2.u();
            }
            ampm ampmVar5 = (ampm) aozyVar2.b;
            ampm ampmVar6 = ampm.a;
            ampdVar3.getClass();
            ampmVar5.d = ampdVar3;
            ampmVar5.c = 101;
        }
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amoq amoqVar = (amoq) aozyVar.b;
        ampm ampmVar7 = (ampm) aozyVar2.s();
        amoq amoqVar2 = amoq.a;
        ampmVar7.getClass();
        amoqVar.f = ampmVar7;
        amoqVar.e = BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
    }

    public static void f(aozy aozyVar, long j, String str) {
        long a2;
        aozy createBuilder = amoy.a.createBuilder();
        if (j > 0) {
            if (!((Boolean) a.e()).booleanValue() && j > 2147483647L) {
                throw new IllegalArgumentException(a.cn(j, "Invalid attachment size. Size (", ") is greater than Integer.MAX_VALUE"));
            }
            if (j < 7500) {
                a2 = 5000;
            } else if (j < 2000000) {
                a2 = a(j, 10000);
            } else if (j < 10000000) {
                a2 = a(j, 100000);
            } else {
                a2 = a(j, 1000000);
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amoy amoyVar = (amoy) createBuilder.b;
            amoyVar.b |= 1;
            amoyVar.c = a2;
        }
        if (str != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amoy amoyVar2 = (amoy) createBuilder.b;
            amoyVar2.b |= 2;
            amoyVar2.d = str;
        }
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amoq amoqVar = (amoq) aozyVar.b;
        amoy amoyVar3 = (amoy) createBuilder.s();
        amoq amoqVar2 = amoq.a;
        amoyVar3.getClass();
        amoqVar.f = amoyVar3;
        amoqVar.e = 208;
    }

    public static void g(aozy aozyVar, aozy aozyVar2, String str) {
        amph amphVar;
        if (str != null) {
            aozy createBuilder = amph.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amph amphVar2 = (amph) createBuilder.b;
            amphVar2.b |= 1;
            amphVar2.c = str;
            amphVar = (amph) createBuilder.s();
        } else {
            amphVar = amph.a;
        }
        if (!aozyVar2.b.isMutable()) {
            aozyVar2.u();
        }
        ampm ampmVar = (ampm) aozyVar2.b;
        ampm ampmVar2 = ampm.a;
        amphVar.getClass();
        ampmVar.d = amphVar;
        ampmVar.c = 104;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amoq amoqVar = (amoq) aozyVar.b;
        ampm ampmVar3 = (ampm) aozyVar2.s();
        amoq amoqVar2 = amoq.a;
        ampmVar3.getClass();
        amoqVar.f = ampmVar3;
        amoqVar.e = BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(aozy aozyVar, boolean z) {
        ampa ampaVar;
        if (z) {
            aozy createBuilder = ampa.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ampa ampaVar2 = (ampa) createBuilder.b;
            ampaVar2.c = 1;
            ampaVar2.b = 1 | ampaVar2.b;
            ampaVar = (ampa) createBuilder.s();
        } else {
            ampaVar = ampa.a;
        }
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amoq amoqVar = (amoq) aozyVar.b;
        amoq amoqVar2 = amoq.a;
        ampaVar.getClass();
        amoqVar.d = ampaVar;
        amoqVar.c = 102;
    }

    public static void i(aozy aozyVar, aozy aozyVar2, long j, ameb amebVar) {
        if (j > 0) {
            long j2 = j / 1000;
            if (!aozyVar2.b.isMutable()) {
                aozyVar2.u();
            }
            ampm ampmVar = (ampm) aozyVar2.b;
            ampm ampmVar2 = ampm.a;
            ampmVar.b |= 16;
            ampmVar.h = (int) j2;
        }
        int ordinal = amebVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 12) {
                if (ordinal != 14 && ordinal != 35) {
                    if (ordinal != 46 && ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                switch (ordinal) {
                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                                        ampi ampiVar = ampi.a;
                                        if (!aozyVar2.b.isMutable()) {
                                            aozyVar2.u();
                                        }
                                        ampm ampmVar3 = (ampm) aozyVar2.b;
                                        ampm ampmVar4 = ampm.a;
                                        ampiVar.getClass();
                                        ampmVar3.d = ampiVar;
                                        ampmVar3.c = 107;
                                        break;
                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                                        ampl amplVar = ampl.a;
                                        if (!aozyVar2.b.isMutable()) {
                                            aozyVar2.u();
                                        }
                                        ampm ampmVar5 = (ampm) aozyVar2.b;
                                        ampm ampmVar6 = ampm.a;
                                        amplVar.getClass();
                                        ampmVar5.d = amplVar;
                                        ampmVar5.c = 108;
                                        break;
                                    case 39:
                                        ampd ampdVar = b;
                                        if (!aozyVar2.b.isMutable()) {
                                            aozyVar2.u();
                                        }
                                        ampm ampmVar7 = (ampm) aozyVar2.b;
                                        ampm ampmVar8 = ampm.a;
                                        ampdVar.getClass();
                                        ampmVar7.d = ampdVar;
                                        ampmVar7.c = 101;
                                        break;
                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                                        break;
                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                                    case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                                        break;
                                    default:
                                        b(amebVar);
                                        break;
                                }
                            }
                        } else {
                            ampg ampgVar = ampg.a;
                            if (!aozyVar2.b.isMutable()) {
                                aozyVar2.u();
                            }
                            ampm ampmVar9 = (ampm) aozyVar2.b;
                            ampm ampmVar10 = ampm.a;
                            ampgVar.getClass();
                            ampmVar9.d = ampgVar;
                            ampmVar9.c = 102;
                        }
                    }
                    ampd ampdVar2 = ampd.a;
                    if (!aozyVar2.b.isMutable()) {
                        aozyVar2.u();
                    }
                    ampm ampmVar11 = (ampm) aozyVar2.b;
                    ampm ampmVar12 = ampm.a;
                    ampdVar2.getClass();
                    ampmVar11.d = ampdVar2;
                    ampmVar11.c = 101;
                }
                ampf ampfVar = ampf.a;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                ampm ampmVar13 = (ampm) aozyVar2.b;
                ampm ampmVar14 = ampm.a;
                ampfVar.getClass();
                ampmVar13.d = ampfVar;
                ampmVar13.c = 103;
            } else {
                ampj ampjVar = ampj.a;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                ampm ampmVar15 = (ampm) aozyVar2.b;
                ampm ampmVar16 = ampm.a;
                ampjVar.getClass();
                ampmVar15.d = ampjVar;
                ampmVar15.c = 109;
            }
        }
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amoq amoqVar = (amoq) aozyVar.b;
        ampm ampmVar17 = (ampm) aozyVar2.s();
        amoq amoqVar2 = amoq.a;
        ampmVar17.getClass();
        amoqVar.f = ampmVar17;
        amoqVar.e = BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
    }

    public static void j(aozy aozyVar) {
        ampb ampbVar = ampb.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amoq amoqVar = (amoq) aozyVar.b;
        amoq amoqVar2 = amoq.a;
        ampbVar.getClass();
        amoqVar.f = ampbVar;
        amoqVar.e = 204;
    }

    public static void k(aozy aozyVar, aozy aozyVar2, String str) {
        aozy createBuilder = ampk.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ampk ampkVar = (ampk) createBuilder.b;
        str.getClass();
        ampkVar.b |= 1;
        ampkVar.c = str;
        if (!aozyVar2.b.isMutable()) {
            aozyVar2.u();
        }
        ampm ampmVar = (ampm) aozyVar2.b;
        ampk ampkVar2 = (ampk) createBuilder.s();
        ampm ampmVar2 = ampm.a;
        ampkVar2.getClass();
        ampmVar.d = ampkVar2;
        ampmVar.c = 105;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amoq amoqVar = (amoq) aozyVar.b;
        ampm ampmVar3 = (ampm) aozyVar2.s();
        amoq amoqVar2 = amoq.a;
        ampmVar3.getClass();
        amoqVar.f = ampmVar3;
        amoqVar.e = BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
    }

    public static void l(aozy aozyVar, int i) {
        aozy createBuilder = amos.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amos amosVar = (amos) createBuilder.b;
        amosVar.e = i - 1;
        amosVar.b |= 4;
        amos amosVar2 = (amos) createBuilder.s();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amoq amoqVar = (amoq) aozyVar.b;
        amoq amoqVar2 = amoq.a;
        amosVar2.getClass();
        amoqVar.f = amosVar2;
        amoqVar.e = 206;
    }
}
