package defpackage;

import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ueb extends CursorWrapper {
    final /* synthetic */ ued a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ueb(ued uedVar, Cursor cursor) {
        super(cursor);
        this.a = uedVar;
    }

    public final /* synthetic */ void A() {
        super.close();
    }

    public final /* synthetic */ void B(int i, CharArrayBuffer charArrayBuffer) {
        super.copyStringToBuffer(i, charArrayBuffer);
    }

    public final /* synthetic */ void C(Bundle bundle) {
        super.setExtras(bundle);
    }

    public final /* synthetic */ byte[] D(int i) {
        return super.getBlob(i);
    }

    public final /* synthetic */ String[] E() {
        return super.getColumnNames();
    }

    public final /* synthetic */ Bundle a() {
        return super.getExtras();
    }

    public final /* synthetic */ Boolean b() {
        return Boolean.valueOf(super.isAfterLast());
    }

    public final /* synthetic */ Boolean c() {
        return Boolean.valueOf(super.isBeforeFirst());
    }

    @Override // android.database.CursorWrapper, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.i(new rui(this, 13));
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        this.a.i(new qq(this, i, charArrayBuffer, 18));
    }

    public final /* synthetic */ Boolean d() {
        return Boolean.valueOf(super.isClosed());
    }

    public final /* synthetic */ Boolean e() {
        return Boolean.valueOf(super.isFirst());
    }

    public final /* synthetic */ Boolean f() {
        return Boolean.valueOf(super.isLast());
    }

    public final /* synthetic */ Boolean g(int i) {
        return Boolean.valueOf(super.isNull(i));
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final byte[] getBlob(int i) {
        return (byte[]) this.a.f(new mcg(this, i, 14));
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getColumnCount() {
        return ((Integer) this.a.f(new tbv(this, 11))).intValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getColumnIndex(String str) {
        return ((Integer) this.a.f(new udz(this, str, 0))).intValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getColumnIndexOrThrow(String str) {
        return ((Integer) this.a.f(new udz(this, str, 1))).intValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final String getColumnName(int i) {
        return (String) this.a.f(new mcg(this, i, 13));
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final String[] getColumnNames() {
        return (String[]) this.a.f(new tbv(this, 19));
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getCount() {
        return ((Integer) this.a.f(new tbv(this, 14))).intValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final double getDouble(int i) {
        return ((Double) this.a.f(new mcg(this, i, 6))).doubleValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final Bundle getExtras() {
        return (Bundle) this.a.f(new tbv(this, 13));
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final float getFloat(int i) {
        return ((Float) this.a.f(new mcg(this, i, 5))).floatValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getInt(int i) {
        return ((Integer) this.a.f(new mcg(this, i, 7))).intValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final long getLong(int i) {
        return ((Long) this.a.f(new mcg(this, i, 8))).longValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getPosition() {
        return ((Integer) this.a.f(new tbv(this, 12))).intValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final short getShort(int i) {
        return ((Short) this.a.f(new mcg(this, i, 9))).shortValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final String getString(int i) {
        return (String) this.a.f(new mcg(this, i, 3));
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getType(int i) {
        return ((Integer) this.a.f(new mcg(this, i, 12))).intValue();
    }

    public final /* synthetic */ Boolean h(int i) {
        return Boolean.valueOf(super.move(i));
    }

    public final /* synthetic */ Boolean i() {
        return Boolean.valueOf(super.moveToFirst());
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isAfterLast() {
        return ((Boolean) this.a.f(new tbv(this, 15))).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isBeforeFirst() {
        return ((Boolean) this.a.f(new tbv(this, 20))).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isClosed() {
        return ((Boolean) this.a.f(new tbv(this, 10))).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isFirst() {
        return ((Boolean) this.a.f(new tbv(this, 18))).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isLast() {
        return ((Boolean) this.a.f(new tbv(this, 17))).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isNull(int i) {
        return ((Boolean) this.a.f(new mcg(this, i, 10))).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Boolean j() {
        return Boolean.valueOf(super.moveToLast());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Boolean k() {
        return Boolean.valueOf(super.moveToNext());
    }

    public final /* synthetic */ Boolean l(int i) {
        return Boolean.valueOf(super.moveToPosition(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Boolean m() {
        return Boolean.valueOf(super.moveToPrevious());
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean move(int i) {
        return ((Boolean) this.a.f(new mcg(this, i, 4))).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToFirst() {
        return ((Boolean) this.a.f(new tbv(this, 16))).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToLast() {
        return ((Boolean) this.a.f(new uea(this, 0))).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToNext() {
        return ((Boolean) this.a.f(new uea(this, 2))).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPosition(int i) {
        return ((Boolean) this.a.f(new mcg(this, i, 11))).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPrevious() {
        return ((Boolean) this.a.f(new uea(this, 1))).booleanValue();
    }

    public final /* synthetic */ Double n(int i) {
        return Double.valueOf(super.getDouble(i));
    }

    public final /* synthetic */ Float o(int i) {
        return Float.valueOf(super.getFloat(i));
    }

    public final /* synthetic */ Integer p() {
        return Integer.valueOf(super.getColumnCount());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Integer q(String str) {
        return Integer.valueOf(super.getColumnIndex(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Integer r(String str) {
        return Integer.valueOf(super.getColumnIndexOrThrow(str));
    }

    public final /* synthetic */ Integer s() {
        return Integer.valueOf(super.getCount());
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final void setExtras(Bundle bundle) {
        this.a.i(new ryv(this, bundle, 12, null));
    }

    public final /* synthetic */ Integer t(int i) {
        return Integer.valueOf(super.getInt(i));
    }

    public final /* synthetic */ Integer u() {
        return Integer.valueOf(super.getPosition());
    }

    public final /* synthetic */ Integer v(int i) {
        return Integer.valueOf(super.getType(i));
    }

    public final /* synthetic */ Long w(int i) {
        return Long.valueOf(super.getLong(i));
    }

    public final /* synthetic */ Short x(int i) {
        return Short.valueOf(super.getShort(i));
    }

    public final /* synthetic */ String y(int i) {
        return super.getColumnName(i);
    }

    public final /* synthetic */ String z(int i) {
        return super.getString(i);
    }
}
