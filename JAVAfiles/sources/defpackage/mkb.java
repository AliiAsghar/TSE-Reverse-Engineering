package defpackage;

import android.content.Context;
import android.database.Cursor;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mkb {
    public static final xze a = xze.g("BugleContacts", "BugleFavoriteContactProvider");
    public final armf b;
    public final AtomicReference c = new AtomicReference(Optional.empty());
    private final anen d;
    private final kor e;
    private final lxe f;

    public mkb(lxe lxeVar, kor korVar, anen anenVar, armf armfVar) {
        this.f = lxeVar;
        this.e = korVar;
        this.d = anenVar;
        this.b = armfVar;
    }

    public static boolean c(Cursor cursor) {
        if (cursor.getString(4) == null) {
            return true;
        }
        return false;
    }

    public final akul a() {
        return aktp.ai(new mig(this, 2), this.d);
    }

    public final alog b(Cursor cursor) {
        cursor.moveToPosition(-1);
        alob alobVar = new alob();
        while (cursor.moveToNext()) {
            String string = cursor.getString(3);
            string.getClass();
            alobVar.h(string);
        }
        kor korVar = this.e;
        alog g = alobVar.g();
        if (g.isEmpty()) {
            return alsx.a;
        }
        return korVar.e("getContactsByLookupKeys", new mjz(g, 0));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    public final agoe d(Cursor cursor) {
        int i = cursor.getInt(5);
        String string = cursor.getString(4);
        string.getClass();
        lxe lxeVar = this.f;
        Context context = (Context) lxeVar.a.b();
        context.getClass();
        msk mskVar = (msk) lxeVar.b.b();
        mskVar.getClass();
        return new agoe(context, mskVar, i, string);
    }
}
