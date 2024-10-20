package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hru implements hse {
    private final /* synthetic */ int a;
    private final Object b;

    public hru(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private static Uri c(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // defpackage.hse
    public final /* synthetic */ boolean a(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return true;
                            }
                            Uri uri = (Uri) obj;
                            if (hlc.g(uri) && hlc.i(uri)) {
                                return true;
                            }
                            return false;
                        }
                        Uri uri2 = (Uri) obj;
                        if (hlc.g(uri2) && !hlc.i(uri2)) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return hlc.g((Uri) obj);
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, hse] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, hse] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, hse] */
    /* JADX WARN: Type inference failed for: r8v1, types: [hrs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, hrf] */
    @Override // defpackage.hse
    public final /* synthetic */ kkc b(Object obj, int i, int i2, hnj hnjVar) {
        Uri uri;
        Long l;
        int i3 = this.a;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                return this.b.b(new hrv((URL) obj), i, i2, hnjVar);
                            }
                            Uri uri2 = (Uri) obj;
                            if (!hlc.h(i, i2) || (l = (Long) hnjVar.b(hut.a)) == null || l.longValue() != -1) {
                                return null;
                            }
                            hyf hyfVar = new hyf(uri2);
                            Context context = (Context) this.b;
                            return new kkc(hyfVar, hrr.b(context, uri2, new hoj(context.getContentResolver())));
                        }
                        Uri uri3 = (Uri) obj;
                        if (!hlc.h(i, i2)) {
                            return null;
                        }
                        hyf hyfVar2 = new hyf(uri3);
                        Context context2 = (Context) this.b;
                        return new kkc(hyfVar2, hrr.b(context2, uri3, new hoi(context2.getContentResolver())));
                    }
                    String str = (String) obj;
                    if (TextUtils.isEmpty(str)) {
                        uri = null;
                    } else if (str.charAt(0) == '/') {
                        uri = c(str);
                    } else {
                        Uri parse = Uri.parse(str);
                        if (parse.getScheme() == null) {
                            uri = c(str);
                        } else {
                            uri = parse;
                        }
                    }
                    if (uri == null || !this.b.a(uri)) {
                        return null;
                    }
                    return this.b.b(uri, i, i2, hnjVar);
                }
                Uri uri4 = (Uri) obj;
                return new kkc(new hyf(uri4), new hsa((Context) this.b, uri4));
            }
            byte[] bArr = (byte[]) obj;
            return new kkc(new hyf(bArr), new hrg(bArr, this.b));
        }
        File file = (File) obj;
        return new kkc(new hyf(file), new hrr(file, (hrs) this.b, 0));
    }

    public hru(Context context, int i, byte[] bArr) {
        this.a = i;
        this.b = context.getApplicationContext();
    }

    public hru(Context context, int i, char[] cArr) {
        this.a = i;
        this.b = context.getApplicationContext();
    }
}
