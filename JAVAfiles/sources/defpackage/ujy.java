package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ujy {
    public static final boolean a(int i) {
        if (i != 232 && i != 251) {
            return false;
        }
        return true;
    }

    public static long b(MessageCoreData messageCoreData, sya syaVar, xze xzeVar) {
        long n = messageCoreData.n();
        try {
            return syaVar.c();
        } catch (RuntimeException e) {
            xzeVar.r("receivedTimestamp not in builder, using existing receivedTimestamp", e);
            return n;
        }
    }

    public static final /* synthetic */ uiq c(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (uiq) s;
    }

    public static final void d(String str, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        uiq uiqVar = (uiq) aozyVar.b;
        uiq uiqVar2 = uiq.a;
        uiqVar.e = str;
    }

    public static final void e(int i, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        uiq uiqVar = (uiq) aozyVar.b;
        uiq uiqVar2 = uiq.a;
        uiqVar.c = a.ao(i);
    }

    public static String f(Context context) {
        return String.valueOf(context.getApplicationContext().getPackageName()).concat(".shared.datamodel.provider.VerifiedSmsBrandLogoFileProvider");
    }

    public static String g(rpj rpjVar) {
        return rpjVar.b().a;
    }

    public static agmh[] h() {
        return (agmh[]) rlv.d.b;
    }
}
