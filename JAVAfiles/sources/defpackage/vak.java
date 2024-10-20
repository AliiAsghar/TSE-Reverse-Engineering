package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.drm.DrmConvertedStatus;
import android.drm.DrmManagerClient;
import android.net.Uri;
import android.provider.Telephony;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.time.Duration;
import j$.time.Instant;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vak {
    public static final SparseIntArray c;
    public static final SparseIntArray d;
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public static final SparseIntArray g;
    private static final vl l;
    private static final SparseArray m;
    private static final SparseArray n;
    private static final SparseArray o;
    private static final SparseArray p;
    private static final SparseArray q;
    public final ContentResolver h;
    public final mce i;
    private final Context r;
    private final xnv s;
    private final wyt t;
    private final xca u;
    private final armf v;
    private static final byte[] j = new byte[0];
    private static final int[] k = {129, 130, 137, 151};
    public static final String[] a = {"_id", "msg_box", "thread_id", "retr_txt", "sub", "ct_l", "ct_t", "m_cls", "m_id", "resp_txt", "tr_id", "ct_cls", "d_rpt", "m_type", "v", "pri", "rr", "read_status", "rpt_a", "retr_st", "st", "date", "d_tm", "exp", "m_size", "sub_cs", "retr_txt_cs", "read", "seen"};
    public static final String[] b = {"_id", "chset", "cd", "cid", "cl", "ct", "fn", "name", ConversationSuggestion.SUGGESTION_PROPERTY_TEXT};

    static {
        vl vlVar = new vl();
        l = vlVar;
        vlVar.put(Telephony.Mms.Inbox.CONTENT_URI, 1);
        vlVar.put(Telephony.Mms.Sent.CONTENT_URI, 2);
        vlVar.put(Telephony.Mms.Draft.CONTENT_URI, 3);
        vlVar.put(Telephony.Mms.Outbox.CONTENT_URI, 4);
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        sparseIntArray.put(150, 25);
        sparseIntArray.put(154, 26);
        SparseArray sparseArray = new SparseArray();
        m = sparseArray;
        sparseArray.put(150, "sub_cs");
        sparseArray.put(154, "retr_txt_cs");
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        d = sparseIntArray2;
        sparseIntArray2.put(154, 3);
        sparseIntArray2.put(150, 4);
        SparseArray sparseArray2 = new SparseArray();
        n = sparseArray2;
        sparseArray2.put(154, "retr_txt");
        sparseArray2.put(150, "sub");
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        e = sparseIntArray3;
        sparseIntArray3.put(131, 5);
        sparseIntArray3.put(132, 6);
        sparseIntArray3.put(138, 7);
        sparseIntArray3.put(139, 8);
        sparseIntArray3.put(147, 9);
        sparseIntArray3.put(152, 10);
        SparseArray sparseArray3 = new SparseArray();
        o = sparseArray3;
        sparseArray3.put(131, "ct_l");
        sparseArray3.put(132, "ct_t");
        sparseArray3.put(138, "m_cls");
        sparseArray3.put(139, "m_id");
        sparseArray3.put(147, "resp_txt");
        sparseArray3.put(152, "tr_id");
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        f = sparseIntArray4;
        sparseIntArray4.put(186, 11);
        sparseIntArray4.put(134, 12);
        sparseIntArray4.put(140, 13);
        sparseIntArray4.put(141, 14);
        sparseIntArray4.put(143, 15);
        sparseIntArray4.put(144, 16);
        sparseIntArray4.put(155, 17);
        sparseIntArray4.put(145, 18);
        sparseIntArray4.put(153, 19);
        sparseIntArray4.put(149, 20);
        SparseArray sparseArray4 = new SparseArray();
        p = sparseArray4;
        sparseArray4.put(186, "ct_cls");
        sparseArray4.put(134, "d_rpt");
        sparseArray4.put(140, "m_type");
        sparseArray4.put(141, "v");
        sparseArray4.put(143, "pri");
        sparseArray4.put(144, "rr");
        sparseArray4.put(155, "read_status");
        sparseArray4.put(145, "rpt_a");
        sparseArray4.put(153, "retr_st");
        sparseArray4.put(149, "st");
        SparseIntArray sparseIntArray5 = new SparseIntArray();
        g = sparseIntArray5;
        sparseIntArray5.put(133, 21);
        sparseIntArray5.put(135, 22);
        sparseIntArray5.put(136, 23);
        sparseIntArray5.put(142, 24);
        SparseArray sparseArray5 = new SparseArray();
        q = sparseArray5;
        sparseArray5.put(133, "date");
        sparseArray5.put(135, "d_tm");
        sparseArray5.put(136, "exp");
        sparseArray5.put(142, "m_size");
    }

    public vak(Context context, mce mceVar, xnv xnvVar, wyt wytVar, xca xcaVar, armf armfVar) {
        this.r = context;
        this.h = context.getContentResolver();
        this.i = mceVar;
        this.s = xnvVar;
        this.t = wytVar;
        this.u = xcaVar;
        this.v = armfVar;
    }

    public static Uri a(long j2) {
        return Uri.parse(a.cn(j2, "content://mms/", "/part"));
    }

    public static String c(byte[] bArr) {
        try {
            return new String(bArr, "iso-8859-1");
        } catch (UnsupportedEncodingException e2) {
            xzb.i("Bugle", e2, "PduPersister: ISO_8859_1 must be supported!");
            return "";
        }
    }

    public static HashSet d(String str, Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (TextUtils.isEmpty(str) || !PhoneNumberUtils.compare(str2, str)) {
                if (!hashSet.contains(str2)) {
                    hashSet.add(str2);
                }
            }
        }
        if (collection.size() == hashSet.size() && str != null) {
            xzb.k("Bugle", "Did not remove self %s from mms", yyb.bh(str));
        } else {
            xzb.c("Bugle", "successfully removed self from mms");
        }
        return hashSet;
    }

    public static byte[] e(Cursor cursor, int i) {
        if (!cursor.isNull(i)) {
            return f(cursor.getString(i));
        }
        return null;
    }

    public static byte[] f(String str) {
        try {
            return str.getBytes("iso-8859-1");
        } catch (UnsupportedEncodingException e2) {
            xzb.i("Bugle", e2, "PduPersister: ISO_8859_1 must be supported!");
            return new byte[0];
        }
    }

    private static String h(Context context, Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null && !scheme.isEmpty() && !scheme.equals("file")) {
            if (scheme.equals("http")) {
                return uri.toString();
            }
            if (scheme.equals("content")) {
                Cursor cursor = null;
                try {
                    try {
                        Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
                        if (query != null && query.getCount() != 0 && query.moveToFirst()) {
                            String string = query.getString(query.getColumnIndexOrThrow("_data"));
                            query.close();
                            return string;
                        }
                        throw new IllegalArgumentException("Given Uri could not be found in media store");
                    } catch (SQLiteException e2) {
                        throw new IllegalArgumentException("Given Uri is not formatted in a way so that it can be found in media store.", e2);
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            throw new IllegalArgumentException("Given Uri scheme is not supported");
        }
        return uri.getPath();
    }

    private static String i(gs gsVar) {
        if (gsVar.n() == null) {
            return null;
        }
        return c(gsVar.n());
    }

    private static void j(OutputStream outputStream, InputStream inputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e2) {
                xzb.i("Bugle", e2, "PduPersister: IOException while closing: ".concat(outputStream.toString()));
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e3) {
                xzb.i("Bugle", e3, "IOException while closing: ".concat(inputStream.toString()));
            }
        }
    }

    private final void k(int i, HashSet hashSet, SparseArray sparseArray) {
        gi[] giVarArr = (gi[]) sparseArray.get(i);
        if (giVarArr != null) {
            for (gi giVar : giVarArr) {
                if (giVar != null) {
                    String f2 = this.u.f(giVar.b());
                    if (!hashSet.contains(f2)) {
                        hashSet.add(f2);
                    }
                }
            }
        }
    }

    private final void l(String str, long j2, long j3) {
        xam xamVar = (xam) this.v.b();
        Duration between = Duration.between(Instant.ofEpochMilli(j3), this.s.f());
        between.getClass();
        qiu.h(qjh.j(xamVar.b, new jmo(xamVar, str, j2, between, (arpe) null, 6, (byte[]) null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 16, insn: 0x040b: MOVE (r4 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]) (LINE:1036), block:B:305:0x040a */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x040d: MOVE (r15 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]) (LINE:1038), block:B:305:0x040a */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0191 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0205 A[Catch: all -> 0x0218, IOException -> 0x021c, FileNotFoundException -> 0x0223, SQLiteException -> 0x022a, TryCatch #26 {SQLiteException -> 0x022a, FileNotFoundException -> 0x0223, IOException -> 0x021c, all -> 0x0218, blocks: (B:124:0x01ed, B:153:0x0205, B:154:0x0217), top: B:117:0x01b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m(defpackage.gs r21, android.net.Uri r22, java.lang.String r23, java.util.Map r24) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vak.m(gs, android.net.Uri, java.lang.String, java.util.Map):void");
    }

    private final void n(String str, long j2, int i) {
        xam xamVar = (xam) this.v.b();
        qiu.h(qjh.j(xamVar.b, new xal(xamVar, str, j2, i, null, 0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    private final void o(atal atalVar, String str) {
        RandomAccessFile randomAccessFile;
        String bW;
        try {
            DrmConvertedStatus closeConvertSession = ((DrmManagerClient) atalVar.b).closeConvertSession(atalVar.a);
            if (closeConvertSession != null && closeConvertSession.statusCode == 1) {
                RandomAccessFile randomAccessFile2 = closeConvertSession.convertedData;
                try {
                    if (randomAccessFile2 != 0) {
                        try {
                            randomAccessFile = new RandomAccessFile(str, "rw");
                        } catch (FileNotFoundException e2) {
                            e = e2;
                            randomAccessFile = null;
                        } catch (IOException e3) {
                            e = e3;
                            randomAccessFile = null;
                        } catch (IllegalArgumentException e4) {
                            e = e4;
                            randomAccessFile = null;
                        } catch (SecurityException e5) {
                            e = e5;
                            randomAccessFile = null;
                        } catch (Throwable th) {
                            th = th;
                            randomAccessFile2 = 0;
                            if (randomAccessFile2 != 0) {
                                try {
                                    randomAccessFile2.close();
                                } catch (IOException e6) {
                                    Log.w("DrmConvertSession", a.bW(str, "Failed to close File:", "."), e6);
                                }
                            }
                            throw th;
                        }
                        try {
                            randomAccessFile.seek(closeConvertSession.offset);
                            randomAccessFile.write(closeConvertSession.convertedData);
                        } catch (FileNotFoundException e7) {
                            e = e7;
                            Log.w("DrmConvertSession", a.bW(str, "File: ", " could not be found."), e);
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                } catch (IOException e8) {
                                    e = e8;
                                    bW = a.bW(str, "Failed to close File:", ".");
                                    Log.w("DrmConvertSession", bW, e);
                                    File file = new File(str);
                                    ContentValues contentValues = new ContentValues(0);
                                    mce mceVar = this.i;
                                    ContentResolver contentResolver = this.h;
                                    mbm b2 = mceVar.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                                    vcp.d(contentResolver, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file.getName()))), contentValues, null, null);
                                    b2.c();
                                }
                            }
                            File file2 = new File(str);
                            ContentValues contentValues2 = new ContentValues(0);
                            mce mceVar2 = this.i;
                            ContentResolver contentResolver2 = this.h;
                            mbm b22 = mceVar2.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                            vcp.d(contentResolver2, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file2.getName()))), contentValues2, null, null);
                            b22.c();
                        } catch (IOException e9) {
                            e = e9;
                            Log.w("DrmConvertSession", a.bW(str, "Could not access File: ", " ."), e);
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                } catch (IOException e10) {
                                    e = e10;
                                    bW = a.bW(str, "Failed to close File:", ".");
                                    Log.w("DrmConvertSession", bW, e);
                                    File file22 = new File(str);
                                    ContentValues contentValues22 = new ContentValues(0);
                                    mce mceVar22 = this.i;
                                    ContentResolver contentResolver22 = this.h;
                                    mbm b222 = mceVar22.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                                    vcp.d(contentResolver22, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file22.getName()))), contentValues22, null, null);
                                    b222.c();
                                }
                            }
                            File file222 = new File(str);
                            ContentValues contentValues222 = new ContentValues(0);
                            mce mceVar222 = this.i;
                            ContentResolver contentResolver222 = this.h;
                            mbm b2222 = mceVar222.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                            vcp.d(contentResolver222, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file222.getName()))), contentValues222, null, null);
                            b2222.c();
                        } catch (IllegalArgumentException e11) {
                            e = e11;
                            Log.w("DrmConvertSession", "Could not open file in mode: rw", e);
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                } catch (IOException e12) {
                                    e = e12;
                                    bW = a.bW(str, "Failed to close File:", ".");
                                    Log.w("DrmConvertSession", bW, e);
                                    File file2222 = new File(str);
                                    ContentValues contentValues2222 = new ContentValues(0);
                                    mce mceVar2222 = this.i;
                                    ContentResolver contentResolver2222 = this.h;
                                    mbm b22222 = mceVar2222.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                                    vcp.d(contentResolver2222, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file2222.getName()))), contentValues2222, null, null);
                                    b22222.c();
                                }
                            }
                            File file22222 = new File(str);
                            ContentValues contentValues22222 = new ContentValues(0);
                            mce mceVar22222 = this.i;
                            ContentResolver contentResolver22222 = this.h;
                            mbm b222222 = mceVar22222.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                            vcp.d(contentResolver22222, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file22222.getName()))), contentValues22222, null, null);
                            b222222.c();
                        } catch (SecurityException e13) {
                            e = e13;
                            Log.w("DrmConvertSession", a.bW(str, "Access to File: ", " was denied denied by SecurityManager."), e);
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                } catch (IOException e14) {
                                    e = e14;
                                    bW = a.bW(str, "Failed to close File:", ".");
                                    Log.w("DrmConvertSession", bW, e);
                                    File file222222 = new File(str);
                                    ContentValues contentValues222222 = new ContentValues(0);
                                    mce mceVar222222 = this.i;
                                    ContentResolver contentResolver222222 = this.h;
                                    mbm b2222222 = mceVar222222.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                                    vcp.d(contentResolver222222, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file222222.getName()))), contentValues222222, null, null);
                                    b2222222.c();
                                }
                            }
                            File file2222222 = new File(str);
                            ContentValues contentValues2222222 = new ContentValues(0);
                            mce mceVar2222222 = this.i;
                            ContentResolver contentResolver2222222 = this.h;
                            mbm b22222222 = mceVar2222222.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                            vcp.d(contentResolver2222222, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file2222222.getName()))), contentValues2222222, null, null);
                            b22222222.c();
                        }
                        try {
                            randomAccessFile.close();
                        } catch (IOException e15) {
                            e = e15;
                            bW = a.bW(str, "Failed to close File:", ".");
                            Log.w("DrmConvertSession", bW, e);
                            File file22222222 = new File(str);
                            ContentValues contentValues22222222 = new ContentValues(0);
                            mce mceVar22222222 = this.i;
                            ContentResolver contentResolver22222222 = this.h;
                            mbm b222222222 = mceVar22222222.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                            vcp.d(contentResolver22222222, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file22222222.getName()))), contentValues22222222, null, null);
                            b222222222.c();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (IllegalStateException e16) {
            Log.w("DrmConvertSession", "Could not close convertsession. Convertsession: " + atalVar.a, e16);
        }
        File file222222222 = new File(str);
        ContentValues contentValues222222222 = new ContentValues(0);
        mce mceVar222222222 = this.i;
        ContentResolver contentResolver222222222 = this.h;
        mbm b2222222222 = mceVar222222222.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
        vcp.d(contentResolver222222222, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file222222222.getName()))), contentValues222222222, null, null);
        b2222222222.c();
    }

    private final void p(InputStream inputStream, boolean z, OutputStream outputStream, atal atalVar, String str) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                if (!z) {
                    outputStream.write(bArr, 0, read);
                } else {
                    byte[] o2 = atalVar.o(bArr, read);
                    if (o2 != null) {
                        long epochMilli = this.s.f().toEpochMilli();
                        int length = o2.length;
                        outputStream.write(o2, 0, length);
                        l(str, length, epochMilli);
                    } else {
                        throw new gl("Error converting drm data.");
                    }
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0133 A[Catch: all -> 0x014c, TRY_LEAVE, TryCatch #3 {all -> 0x014c, blocks: (B:3:0x000a, B:6:0x0023, B:7:0x003a, B:10:0x0045, B:12:0x0062, B:15:0x006c, B:18:0x0074, B:20:0x0085, B:22:0x0095, B:23:0x00ab, B:25:0x00b8, B:26:0x00c2, B:28:0x00c8, B:29:0x00d2, B:31:0x00d8, B:32:0x00e2, B:34:0x00ee, B:35:0x00f7, B:37:0x00fd, B:38:0x0106, B:40:0x010c, B:42:0x0115, B:44:0x0123, B:46:0x0133, B:50:0x013c, B:51:0x0143, B:54:0x012c, B:58:0x0144, B:59:0x014b, B:60:0x002b, B:62:0x0031), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013c A[Catch: all -> 0x014c, TRY_ENTER, TryCatch #3 {all -> 0x014c, blocks: (B:3:0x000a, B:6:0x0023, B:7:0x003a, B:10:0x0045, B:12:0x0062, B:15:0x006c, B:18:0x0074, B:20:0x0085, B:22:0x0095, B:23:0x00ab, B:25:0x00b8, B:26:0x00c2, B:28:0x00c8, B:29:0x00d2, B:31:0x00d8, B:32:0x00e2, B:34:0x00ee, B:35:0x00f7, B:37:0x00fd, B:38:0x0106, B:40:0x010c, B:42:0x0115, B:44:0x0123, B:46:0x0133, B:50:0x013c, B:51:0x0143, B:54:0x012c, B:58:0x0144, B:59:0x014b, B:60:0x002b, B:62:0x0031), top: B:2:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.net.Uri b(defpackage.gs r11, long r12, java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vak.b(gs, long, java.util.Map):android.net.Uri");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0378  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.net.Uri g(defpackage.gj r23, android.net.Uri r24, int r25, java.lang.String r26, long r27, java.util.Map r29) {
        /*
            Method dump skipped, instructions count: 1415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vak.g(gj, android.net.Uri, int, java.lang.String, long, java.util.Map):android.net.Uri");
    }
}
