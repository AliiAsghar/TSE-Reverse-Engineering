package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.DesugarArrays;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uli {
    public final Object a;

    public uli(armf armfVar) {
        this.a = armfVar;
    }

    public static List d(String str) {
        xyl.h();
        tfn tfnVar = new tfn(tfp.a);
        tfnVar.w("+queryRecentExpressiveStickers");
        tfnVar.z((String) DesugarArrays.stream(new atkn[]{new atkn(tfp.c.e, false)}).map(new sho(20)).collect(Collectors.joining(", ")));
        tfnVar.v(str);
        return tfnVar.b().t();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final uqg a(MessageIdType messageIdType, rve rveVar) {
        uqg uqgVar = (uqg) this.a.b();
        uqgVar.getClass();
        messageIdType.getClass();
        rveVar.getClass();
        return new uqg(uqgVar, messageIdType, rveVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void b(ulz ulzVar) {
        ((uof) this.a.b()).a(upk.a("delete_message_from_telephony", ulzVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void c(uls ulsVar) {
        ((uof) this.a.b()).a(upk.a("cleanup_part_uri_handler", ulsVar));
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [armf, java.lang.Object] */
    public final void e(tfh tfhVar) {
        agnw d;
        agnw d2;
        akrh e = aktp.e("RecentExpressiveStickerDatabaseOperations#insertOrReplaceRecentExpressiveSticker");
        try {
            xyl.h();
            d = agnc.d("$primary");
            d2 = agnc.d("$primary");
            agnc.a(d2, "recent_expressive_stickers", tfhVar, new tbe(d, 13), new swb(7));
            uhj uhjVar = (uhj) this.a.b();
            akrh e2 = aktp.e("DataChangeNotifier#notifyExpressiveStickersChanged");
            try {
                uhjVar.c.f(Uri.parse(upb.s(uhjVar.b).concat("expressivestickers/recents")));
                e2.close();
                e.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public uli(armf armfVar, byte[] bArr, byte[] bArr2, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public uli(armf armfVar, char[] cArr, char[] cArr2) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public uli(armf armfVar, byte[] bArr, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public uli(byte[] bArr, byte[] bArr2) {
        this.a = new Random();
    }

    public uli(byte[] bArr) {
        this.a = new ConcurrentHashMap();
    }

    public uli() {
        this.a = new ConcurrentHashMap();
    }

    public uli(armf armfVar, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
    }
}
