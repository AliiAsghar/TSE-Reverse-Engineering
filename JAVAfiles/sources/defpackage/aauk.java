package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aauk {
    private static final xze a = xze.g("Bugle", "MessagePartAttachmentLoggingHelper");

    public static amoq a(MessagePartCoreData messagePartCoreData) {
        return b(messagePartCoreData, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0097. Please report as an issue. */
    public static amoq b(MessagePartCoreData messagePartCoreData, aauj aaujVar) {
        amoq N = messagePartCoreData.N();
        String ad = messagePartCoreData.ad();
        if (N == null) {
            if (messagePartCoreData.bw() && ad != null) {
                int i = aaui.c;
                aozy createBuilder = amoq.a.createBuilder();
                aozy createBuilder2 = ampq.a.createBuilder();
                int a2 = (int) aaui.a(ad.length(), 5);
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ampq ampqVar = (ampq) createBuilder2.b;
                ampqVar.b = 1 | ampqVar.b;
                ampqVar.c = a2;
                ampq ampqVar2 = (ampq) createBuilder2.s();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amoq amoqVar = (amoq) createBuilder.b;
                ampqVar2.getClass();
                amoqVar.f = ampqVar2;
                amoqVar.e = BasePaymentResult.ERROR_REQUEST_TIMEOUT;
                N = (amoq) createBuilder.s();
            } else {
                aozy createBuilder3 = amoq.a.createBuilder();
                if (messagePartCoreData.M() == null) {
                    a.q("Null part source in part ".concat(String.valueOf(String.valueOf(messagePartCoreData))));
                    e(messagePartCoreData, createBuilder3);
                } else {
                    switch (messagePartCoreData.M().ordinal()) {
                        case 1:
                            a.q("Unknown source in part ".concat(String.valueOf(String.valueOf(messagePartCoreData))));
                            e(messagePartCoreData, createBuilder3);
                            break;
                        case 2:
                        case 24:
                        case 30:
                        case 31:
                        case 32:
                        case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                        case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                        case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                        default:
                            throw new IllegalArgumentException("Invalid message source, number representation: " + messagePartCoreData.M().a() + ", in " + String.valueOf(messagePartCoreData));
                        case 3:
                        case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                        case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                        case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                            aaui.e(createBuilder3, c(messagePartCoreData), messagePartCoreData.k(), null);
                            break;
                        case 4:
                        case 5:
                        case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                        case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                        case 39:
                            aaui.i(createBuilder3, c(messagePartCoreData), messagePartCoreData.k(), messagePartCoreData.M());
                            break;
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            aaui.j(createBuilder3);
                            break;
                        case 10:
                            aaui.d(createBuilder3, messagePartCoreData.k());
                            break;
                        case 11:
                        case 26:
                        case 27:
                        case 28:
                            aaui.k(createBuilder3, c(messagePartCoreData), String.valueOf(messagePartCoreData.ac()));
                            break;
                        case 12:
                        case 13:
                        case 14:
                        case 23:
                        case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                        case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                            e(messagePartCoreData, createBuilder3);
                            break;
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 21:
                        case 22:
                            a.q("Unhandled RBM-only source, number representation: " + messagePartCoreData.M().a() + " in part " + String.valueOf(messagePartCoreData));
                            N = amoq.a;
                            break;
                        case 19:
                        case 20:
                            ameb M = messagePartCoreData.M();
                            int i2 = aaui.c;
                            aozy createBuilder4 = ampn.a.createBuilder();
                            if (M == ameb.MONEY_REQUEST) {
                                if (!createBuilder4.b.isMutable()) {
                                    createBuilder4.u();
                                }
                                ampn ampnVar = (ampn) createBuilder4.b;
                                ampnVar.c = 1;
                                ampnVar.b = 1 | ampnVar.b;
                            } else if (M == ameb.MONEY_SEND) {
                                if (!createBuilder4.b.isMutable()) {
                                    createBuilder4.u();
                                }
                                ampn ampnVar2 = (ampn) createBuilder4.b;
                                ampnVar2.c = 2;
                                ampnVar2.b = 1 | ampnVar2.b;
                            } else {
                                aaui.b(M);
                            }
                            if (!createBuilder3.b.isMutable()) {
                                createBuilder3.u();
                            }
                            amoq amoqVar2 = (amoq) createBuilder3.b;
                            ampn ampnVar3 = (ampn) createBuilder4.s();
                            ampnVar3.getClass();
                            amoqVar2.f = ampnVar3;
                            amoqVar2.e = 205;
                            break;
                        case 25:
                            g(messagePartCoreData, createBuilder3);
                            break;
                        case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                            h(createBuilder3);
                            break;
                        case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                            f(messagePartCoreData, createBuilder3);
                            aaui.h(createBuilder3, true);
                            break;
                        case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                            d(messagePartCoreData, createBuilder3);
                            break;
                        case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                            f(messagePartCoreData, createBuilder3);
                            aaui.h(createBuilder3, false);
                            break;
                    }
                }
                N = (amoq) createBuilder3.s();
            }
        }
        if (aaujVar != null) {
            aozy createBuilder5 = amoq.a.createBuilder(N);
            aaujVar.b(createBuilder5);
            return (amoq) createBuilder5.s();
        }
        return N;
    }

    private static aozy c(MessagePartCoreData messagePartCoreData) {
        aozy createBuilder = ampm.a.createBuilder();
        int c = messagePartCoreData.c();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ampm ampmVar = (ampm) createBuilder.b;
        ampmVar.b |= 1;
        ampmVar.e = c;
        int b = messagePartCoreData.b();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ampm ampmVar2 = (ampm) createBuilder.b;
        ampmVar2.b |= 2;
        ampmVar2.f = b;
        String U = messagePartCoreData.U();
        if (U != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ampm ampmVar3 = (ampm) createBuilder.b;
            ampmVar3.b |= 8;
            ampmVar3.g = U;
        }
        aaui.c(messagePartCoreData.t(), createBuilder);
        return createBuilder;
    }

    private static void d(MessagePartCoreData messagePartCoreData, aozy aozyVar) {
        aaui.f(aozyVar, messagePartCoreData.p(), messagePartCoreData.U());
    }

    private static void e(MessagePartCoreData messagePartCoreData, aozy aozyVar) {
        if (!messagePartCoreData.bl() && !messagePartCoreData.bp()) {
            if (messagePartCoreData.by()) {
                h(aozyVar);
                return;
            }
            if (messagePartCoreData.bk()) {
                if (messagePartCoreData.bh()) {
                    g(messagePartCoreData, aozyVar);
                    return;
                } else {
                    f(messagePartCoreData, aozyVar);
                    return;
                }
            }
            if (messagePartCoreData.bz()) {
                f(messagePartCoreData, aozyVar);
                return;
            } else if (messagePartCoreData.bg()) {
                d(messagePartCoreData, aozyVar);
                return;
            } else {
                a.m("Unable to convert part ".concat(String.valueOf(String.valueOf(messagePartCoreData))));
                return;
            }
        }
        aaui.j(aozyVar);
    }

    private static void f(MessagePartCoreData messagePartCoreData, aozy aozyVar) {
        aozy c = c(messagePartCoreData);
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amoq amoqVar = (amoq) aozyVar.b;
        ampm ampmVar = (ampm) c.s();
        amoq amoqVar2 = amoq.a;
        ampmVar.getClass();
        amoqVar.f = ampmVar;
        amoqVar.e = BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
    }

    private static void g(MessagePartCoreData messagePartCoreData, aozy aozyVar) {
        aaui.g(aozyVar, c(messagePartCoreData), null);
    }

    private static void h(aozy aozyVar) {
        aaui.l(aozyVar, 1);
    }
}
