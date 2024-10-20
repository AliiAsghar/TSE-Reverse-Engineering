package defpackage;

import com.google.android.gms.common.internal.IGmsServiceBroker;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imr {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/conversation/draft/model/BugleMessageAttachmentSourceToAttachmentSourceKt");

    public static final afcp a(ameb amebVar) {
        amebVar.getClass();
        int ordinal = amebVar.ordinal();
        if (ordinal != 3) {
            if (ordinal != 4) {
                if (ordinal != 5) {
                    if (ordinal != 12) {
                        if (ordinal != 33 && ordinal != 35) {
                            if (ordinal != 25) {
                                if (ordinal != 26) {
                                    switch (ordinal) {
                                        case 39:
                                            return afgi.a;
                                        case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                                            return new afcm(null, 4);
                                        case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                                            return new afcm(null, 5);
                                        case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                                            return new afgh(1, 1, 1, false, null, null);
                                        case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                                            break;
                                        case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                                            return afqe.a;
                                        case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                                            return afqe.b;
                                        case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                                            return new afgh(3, 1, 1, false, null, null);
                                        default:
                                            if (amebVar != ameb.UNKNOWN && amebVar != ameb.NOT_AVAILABLE) {
                                                alvg alvgVar = (alvg) a.h();
                                                Objects.toString(amebVar);
                                                ((alvg) alvgVar.g(new IllegalStateException("Unhandled attachment source ".concat(amebVar.toString()))).h("com/google/android/apps/messaging/conversation/draft/model/BugleMessageAttachmentSourceToAttachmentSourceKt", "toAttachmentSource", 57, "BugleMessageAttachmentSourceToAttachmentSource.kt")).q("Falling back to Unknown");
                                            }
                                            return afco.a;
                                    }
                                } else {
                                    return afxq.a;
                                }
                            } else {
                                return afqp.a;
                            }
                        } else {
                            return new afcm(null, 3);
                        }
                    } else {
                        return new afcm(null, 2);
                    }
                } else {
                    return afgf.a;
                }
            } else {
                return afge.a;
            }
        }
        return new afgh(2, 1, 1, false, null, null);
    }
}
