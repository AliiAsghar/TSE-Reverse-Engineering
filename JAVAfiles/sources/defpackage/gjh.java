package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gjh extends gjj {
    public int[] a;
    public long[] b;
    public double[] c;
    public String[] d;
    public byte[][] e;
    private Cursor i;

    public gjh(gkd gkdVar, String str) {
        super(gkdVar, str);
        this.a = new int[0];
        this.b = new long[0];
        this.c = new double[0];
        this.d = new String[0];
        this.e = new byte[0];
    }

    private final Cursor l() {
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor;
        }
        gvf.bk(21, "no row");
        throw new armj();
    }

    private final void m() {
        if (this.i == null) {
            this.i = this.f.a(new gjg(this));
        }
    }

    private static final void n(Cursor cursor, int i) {
        if (i >= 0 && i < cursor.getColumnCount()) {
            return;
        }
        gvf.bk(25, "column index out of range");
        throw new armj();
    }

    @Override // defpackage.gkb
    public final int a() {
        i();
        m();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.gkb
    public final long b(int i) {
        i();
        Cursor l = l();
        n(l, i);
        return l.getLong(i);
    }

    @Override // defpackage.gkb
    public final String c(int i) {
        i();
        m();
        Cursor cursor = this.i;
        if (cursor != null) {
            n(cursor, i);
            String columnName = cursor.getColumnName(i);
            columnName.getClass();
            return columnName;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // defpackage.gkb
    public final String d(int i) {
        i();
        Cursor l = l();
        n(l, i);
        String string = l.getString(i);
        string.getClass();
        return string;
    }

    @Override // defpackage.gkb
    public final void e() {
        if (!this.h) {
            i();
            this.a = new int[0];
            this.b = new long[0];
            this.c = new double[0];
            this.d = new String[0];
            this.e = new byte[0];
            f();
        }
        k();
    }

    @Override // defpackage.gkb
    public final void f() {
        i();
        Cursor cursor = this.i;
        if (cursor != null) {
            cursor.close();
        }
        this.i = null;
    }

    @Override // defpackage.gkb
    public final boolean g(int i) {
        i();
        Cursor l = l();
        n(l, i);
        return l.isNull(i);
    }

    @Override // defpackage.gkb
    public final boolean h() {
        i();
        m();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }
}
