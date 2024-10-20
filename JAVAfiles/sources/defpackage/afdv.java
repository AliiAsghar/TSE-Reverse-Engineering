package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afdv {
    public static final /* synthetic */ int c = 0;
    private static final alvi d = alvi.m("com/google/android/libraries/compose/attachments/resolver/MetadataCursorFactory");
    private static final List e;
    public final Context a;
    public final arwe b;

    static {
        armd.a(aezo.i);
        e = aqjn.B(afdy.b, afdy.a);
    }

    public afdv(Context context, arwe arweVar) {
        context.getClass();
        arweVar.getClass();
        this.a = context;
        this.b = arweVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final afdt b(afdz afdzVar, String str, boolean z, arqr arqrVar) {
        afdy afdyVar;
        String[] strArr;
        alvi alviVar;
        Cursor cursor;
        Iterator it = e.iterator();
        while (true) {
            afdx afdxVar = null;
            if (!it.hasNext()) {
                return null;
            }
            afdyVar = (afdy) it.next();
            try {
                strArr = afdzVar.a(afdyVar);
            } catch (Throwable th) {
                th = th;
                strArr = null;
            }
            try {
                alviVar = d;
                ((alvg) alviVar.f().h("com/google/android/libraries/compose/attachments/resolver/MetadataCursorFactory", "repeatQueryWithStrategy", 163, "MetadataCursorFactory.kt")).J("%s; trying quality %s with projection %s", str, afdyVar, new afdx(strArr));
                cursor = (Cursor) arqrVar.a(new afdx(strArr));
                if (cursor == 0) {
                    ((alvg) alviVar.d().h("com/google/android/libraries/compose/attachments/resolver/MetadataCursorFactory", "repeatQueryWithStrategy", 184, "MetadataCursorFactory.kt")).J("%s; null cursor for quality %s with projection %s", str, afdyVar, new afdx(strArr));
                } else {
                    if (!z) {
                        break;
                    }
                    if (cursor.moveToFirst()) {
                        afdxVar = cursor;
                    } else {
                        cursor.close();
                    }
                    if (afdxVar != null) {
                        break;
                    }
                    ((alvg) alviVar.d().h("com/google/android/libraries/compose/attachments/resolver/MetadataCursorFactory", "repeatQueryWithStrategy", 195, "MetadataCursorFactory.kt")).J("%s; moveToFirst failed for cursor for quality %s with projection %s", str, afdyVar, new afdx(strArr));
                }
            } catch (Throwable th2) {
                th = th2;
                if (!(th instanceof CancellationException)) {
                    alvg alvgVar = (alvg) ((alvg) d.i()).g(th).h("com/google/android/libraries/compose/attachments/resolver/MetadataCursorFactory", "repeatQueryWithStrategy", 172, "MetadataCursorFactory.kt");
                    if (strArr != null) {
                        afdxVar = new afdx(strArr);
                    }
                    alvgVar.J("%s; query failed at quality %s with projection %s", str, afdyVar, afdxVar);
                } else {
                    throw th;
                }
            }
        }
        ((alvg) alviVar.g().h("com/google/android/libraries/compose/attachments/resolver/MetadataCursorFactory", "repeatQueryWithStrategy", 205, "MetadataCursorFactory.kt")).J("%s; cursor obtained at quality %s with projection %s", str, afdyVar, new afdx(strArr));
        return new afdt(cursor);
    }

    public final Object a(Uri uri, afdz afdzVar, arpe arpeVar) {
        return arro.q(this.b.b(), new yiv(this, afdzVar, uri, (arpe) null, 6), arpeVar);
    }
}
