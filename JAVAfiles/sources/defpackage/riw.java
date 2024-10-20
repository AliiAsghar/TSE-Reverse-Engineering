package defpackage;

import android.content.Context;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class riw {
    public riw() {
    }

    public static Action a(rix rixVar, ConversationIdType conversationIdType, MessageIdType messageIdType, boolean z, boolean z2, int i) {
        return ((raz) rixVar).a(new ConversationIdType[]{conversationIdType}, messageIdType, z, z2, i, -1);
    }

    public static void b(rix rixVar, ConversationIdType conversationIdType, boolean z) {
        a(rixVar, conversationIdType, rvc.a, z, false, -1).z();
    }

    public static int c() {
        return ((Integer) utw.J.e()).intValue();
    }

    public static boolean d(int i) {
        if (i != 4 && i != 5) {
            return false;
        }
        return true;
    }

    public static final int e(boolean z, boolean z2) {
        if (z) {
            if (!z2) {
                return 38;
            }
            return 18;
        }
        if (!z2) {
            return 33;
        }
        return 13;
    }

    public static final void f(MessageCoreData messageCoreData, Collection collection) {
        if (collection != null) {
            try {
                byte[] bArr = new byte[collection.size()];
                Iterator it = collection.iterator();
                int i = 0;
                while (it.hasNext()) {
                    bArr[i] = ((Number) it.next()).byteValue();
                    i++;
                }
                atok atokVar = (atok) apag.parseFrom(atok.a, bArr, aozs.a());
                atokVar.getClass();
                messageCoreData.bJ(atokVar);
            } catch (apba e) {
                throw new IllegalStateException("Fail to parse traceId.", e);
            }
        }
    }

    public static /* synthetic */ aqcw g(Parcelable parcelable) {
        return (aqcw) ((apdj) parcelable).a(aqcw.a, aozs.a());
    }

    public static /* synthetic */ Object h(Object obj) {
        amgc amgcVar = (amgc) obj;
        int ordinal = amgcVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return asho.IN_INITIAL_SYNC;
                    }
                    throw new IllegalArgumentException("unknown enum value: ".concat(amgcVar.toString()));
                }
                return asho.ENABLED;
            }
            return asho.NOT_ENABLED;
        }
        return asho.UNKNOWN_CLOUD_SYNC_STATUS;
    }

    public static /* synthetic */ Object i(Object obj) {
        asho ashoVar = (asho) obj;
        int ordinal = ashoVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return amgc.IN_INITIAL_SYNC;
                    }
                    throw new IllegalArgumentException("unknown enum value: ".concat(ashoVar.toString()));
                }
                return amgc.ENABLED;
            }
            return amgc.NOT_ENABLED;
        }
        return amgc.UNKNOWN_CLOUD_SYNC_STATUS;
    }

    public static boolean j() {
        return ((Boolean) qye.a.e()).booleanValue();
    }

    public static final long k(long j) {
        return ((j + 500) / 1000) * 1000;
    }

    public static String l(Context context) {
        return String.valueOf(context.getApplicationContext().getPackageName()).concat(".shared.datamodel.BugleContentProviderInternal");
    }

    public static final qwe m(String str) {
        if (str != null) {
            return qwe.a(str);
        }
        return null;
    }

    public static final String n(qwe qweVar) {
        if (qweVar != null) {
            return qweVar.b();
        }
        return null;
    }

    public static final void o(qvd qvdVar, String str) {
        if (oeq.a() && str.length() != 0) {
            qvdVar.f(str);
        }
    }

    public static final void p(qvi qviVar, String str) {
        Integer valueOf;
        Integer valueOf2;
        if (oeq.a() && str.length() != 0) {
            valueOf = Integer.valueOf(a.bp().c());
            int intValue = valueOf.intValue();
            valueOf2 = Integer.valueOf(a.bp().c());
            int intValue2 = valueOf2.intValue();
            if (intValue2 < 59990) {
                agnc.t("provisioning_id", intValue2);
            }
            if (intValue >= 59990) {
                agnc.r(qviVar.a, "provisioning_id", str);
            }
        }
    }

    public static agmh[] q() {
        return (agmh[]) qvk.d.a;
    }

    public riw(armf armfVar) {
        armfVar.getClass();
    }
}
