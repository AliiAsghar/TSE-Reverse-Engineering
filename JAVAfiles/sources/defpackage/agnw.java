package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.net.Uri;
import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface agnw {
    @Deprecated
    void A(String str, Runnable runnable);

    @Deprecated
    void B(Uri uri);

    @Deprecated
    void C(Uri uri, String str);

    void D(String str, Runnable runnable);

    void E(boolean z);

    @Deprecated
    boolean G();

    boolean H(agmp agmpVar);

    boolean I(agmp agmpVar);

    boolean J(agmp agmpVar);

    boolean K(agmp agmpVar, int i);

    boolean L(agmp agmpVar);

    long O(String str, ContentValues contentValues);

    long P(String str, ContentValues contentValues);

    long Q(String str, ContentValues contentValues, int i);

    void U(String str, Runnable runnable, agnt agntVar);

    agcp W();

    int a(String str, String str2, String[] strArr, agny agnyVar);

    int b(SQLiteStatement sQLiteStatement);

    int c(SQLiteStatement sQLiteStatement, agni agniVar);

    int d(agmp agmpVar);

    int e(String str, ContentValues contentValues, String str2, String[] strArr, agpu agpuVar);

    long f(String str, String str2, String[] strArr);

    Cursor g(String str, String[] strArr);

    Cursor h(String str, String[] strArr, agpf agpfVar);

    Cursor i(String str, String[] strArr, agpf agpfVar, CancellationSignal cancellationSignal);

    SQLiteDatabase j();

    agna n();

    akul o();

    Object q(alhr alhrVar);

    @Deprecated
    Object r(alhr alhrVar);

    @Deprecated
    Object s(String str, alhr alhrVar);

    @Deprecated
    Object t(agni agniVar, alhr alhrVar, agnv agnvVar);

    void x();

    void z(String str);
}
