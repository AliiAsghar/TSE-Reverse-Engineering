package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lfg implements ancy {
    private final /* synthetic */ int a;

    public /* synthetic */ lfg(int i) {
        this.a = i;
    }

    @Override // defpackage.ancy
    public final Object a(ahmn ahmnVar, Object obj) {
        switch (this.a) {
            case 0:
                return stl.e((lbz) obj).cR();
            case 1:
                int i = kws.m;
                return stl.e((lbz) obj).cR();
            case 2:
                return zkm.d((Cursor) obj);
            case 3:
                return zkm.d((Cursor) obj);
            case 4:
                return zkm.d((Cursor) obj);
            case 5:
                Cursor cursor = (Cursor) obj;
                cursor.getClass();
                alpr alprVar = new alpr();
                while (cursor.moveToNext()) {
                    alprVar.c(new aapm(cursor.getString(0), 0, cursor.getString(1)));
                }
                return alprVar.g();
            case 6:
                return zkm.d((Cursor) obj);
            case 7:
                Cursor cursor2 = (Cursor) obj;
                cursor2.getClass();
                alpr alprVar2 = new alpr();
                while (cursor2.moveToNext()) {
                    alprVar2.c(new aapm(cursor2.getString(0), 0, null));
                }
                return alprVar2.g();
            case 8:
                return zkm.d((Cursor) obj);
            case 9:
                return zkm.d((Cursor) obj);
            case 10:
                Cursor cursor3 = (Cursor) obj;
                cursor3.getClass();
                cursor3.moveToNext();
                return new aaps(cursor3.getLong(0), cursor3.getString(1));
            default:
                return akto.a(algn.a).apply(obj);
        }
    }
}
