package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbf {
    public static final Map a = new HashMap();
    private static final Set b = new HashSet();
    private static final byte[] c = {80, 75, 3, 4};

    public static hbr a(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return b(context.getAssets().open(str), str2);
            }
            return e(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new hbr((Throwable) e);
        }
    }

    public static hbr b(InputStream inputStream, String str) {
        try {
            asrk asrkVar = new asrk(asre.b(inputStream));
            String[] strArr = hhr.a;
            return c(new hhs(asrkVar), str);
        } finally {
            hid.f(inputStream);
        }
    }

    public static hbr c(hhr hhrVar, String str) {
        return m(hhrVar, str, true);
    }

    public static hbr d(Context context, int i, String str) {
        try {
            asrk asrkVar = new asrk(asre.b(context.getResources().openRawResource(i)));
            if (n(asrkVar).booleanValue()) {
                return e(context, new ZipInputStream(new asrj(asrkVar, 0)), str);
            }
            return b(new asrj(asrkVar, 0), str);
        } catch (Resources.NotFoundException e) {
            return new hbr((Throwable) e);
        }
    }

    public static hbr e(Context context, ZipInputStream zipInputStream, String str) {
        hbr hbrVar;
        hbm hbmVar;
        try {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                hbrVar = null;
                Object obj = null;
                while (nextEntry != null) {
                    String name = nextEntry.getName();
                    if (name.contains("__MACOSX")) {
                        zipInputStream.closeEntry();
                    } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                        zipInputStream.closeEntry();
                    } else if (nextEntry.getName().contains(".json")) {
                        asrk asrkVar = new asrk(asre.b(zipInputStream));
                        String[] strArr = hhr.a;
                        obj = m(new hhs(asrkVar), null, false).a;
                    } else {
                        if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                            if (!name.contains(".ttf") && !name.contains(".otf")) {
                                zipInputStream.closeEntry();
                            }
                            String str2 = name.split("/")[r2.length - 1];
                            String str3 = str2.split("\\.")[0];
                            File file = new File(context.getCacheDir(), str2);
                            new FileOutputStream(file);
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    byte[] bArr = new byte[4096];
                                    while (true) {
                                        int read = zipInputStream.read(bArr);
                                        if (read == -1) {
                                            break;
                                        }
                                        fileOutputStream.write(bArr, 0, read);
                                    }
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                } catch (Throwable th) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                    break;
                                }
                            } catch (Throwable th3) {
                                hhw.b(a.bZ(str2, str3, "Unable to save font ", " to the temporary file: ", ". "), th3);
                            }
                            Typeface createFromFile = Typeface.createFromFile(file);
                            if (!file.delete()) {
                                hhw.a("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                            }
                            hashMap2.put(str3, createFromFile);
                        }
                        hashMap.put(name.split("/")[r2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                if (obj == null) {
                    hbrVar = new hbr((Throwable) new IllegalArgumentException("Unable to parse composition"));
                } else {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String str4 = (String) entry.getKey();
                        Iterator it = ((hbb) obj).b.values().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                hbmVar = (hbm) it.next();
                                if (hbmVar.d.equals(str4)) {
                                    break;
                                }
                            } else {
                                hbmVar = null;
                                break;
                            }
                        }
                        if (hbmVar != null) {
                            hbmVar.e = hid.d((Bitmap) entry.getValue(), hbmVar.a, hbmVar.b);
                        }
                    }
                    for (Map.Entry entry2 : hashMap2.entrySet()) {
                        boolean z = false;
                        for (ibp ibpVar : ((hbb) obj).c.values()) {
                            if (((String) ibpVar.b).equals(entry2.getKey())) {
                                ibpVar.a = (Typeface) entry2.getValue();
                                z = true;
                            }
                        }
                        if (!z) {
                            hhw.a("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
                        }
                    }
                    if (hashMap.isEmpty()) {
                        Iterator it2 = ((hbb) obj).b.entrySet().iterator();
                        while (it2.hasNext()) {
                            hbm hbmVar2 = (hbm) ((Map.Entry) it2.next()).getValue();
                            if (hbmVar2 == null) {
                                break;
                            }
                            String str5 = hbmVar2.d;
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inScaled = true;
                            options.inDensity = 160;
                            if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                                try {
                                    byte[] decode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                                    hbmVar2.e = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                                } catch (IllegalArgumentException e) {
                                    hhw.b("data URL did not have correct base64 format.", e);
                                }
                            }
                        }
                    }
                    Iterator it3 = ((hbb) obj).b.entrySet().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Map.Entry entry3 = (Map.Entry) it3.next();
                            if (((hbm) entry3.getValue()).e == null) {
                                hbrVar = new hbr((Throwable) new IllegalStateException("There is no image for ".concat(((hbm) entry3.getValue()).d)));
                                break;
                            }
                        } else {
                            if (str != null) {
                                heq.a.a(str, (hbb) obj);
                            }
                            hbrVar = new hbr(obj);
                        }
                    }
                }
            } catch (IOException e2) {
                hbrVar = new hbr((Throwable) e2);
            }
            return hbrVar;
        } finally {
            hid.f(zipInputStream);
        }
    }

    public static hbt f(final String str, Callable callable) {
        hbb hbbVar;
        if (str == null) {
            hbbVar = null;
        } else {
            hbbVar = (hbb) heq.a.b.b(str);
        }
        if (hbbVar != null) {
            return new hbt(new gvk(hbbVar, 4));
        }
        if (str != null) {
            Map map = a;
            if (map.containsKey(str)) {
                return (hbt) map.get(str);
            }
        }
        hbt hbtVar = new hbt(callable);
        if (str != null) {
            final int i = 0;
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i2 = 1;
            hbtVar.e(new hbn() { // from class: hbe
                @Override // defpackage.hbn
                public final void a(Object obj) {
                    if (i2 != 0) {
                        hbf.a.remove(str);
                        atomicBoolean.set(true);
                        if (hbf.a.size() == 0) {
                            hbf.l();
                            return;
                        }
                        return;
                    }
                    hbf.a.remove(str);
                    atomicBoolean.set(true);
                    if (hbf.a.size() == 0) {
                        hbf.l();
                    }
                }
            });
            hbtVar.d(new hbn() { // from class: hbe
                @Override // defpackage.hbn
                public final void a(Object obj) {
                    if (i != 0) {
                        hbf.a.remove(str);
                        atomicBoolean.set(true);
                        if (hbf.a.size() == 0) {
                            hbf.l();
                            return;
                        }
                        return;
                    }
                    hbf.a.remove(str);
                    atomicBoolean.set(true);
                    if (hbf.a.size() == 0) {
                        hbf.l();
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map map2 = a;
                map2.put(str, hbtVar);
                if (map2.size() == 1) {
                    l();
                }
            }
        }
        return hbtVar;
    }

    public static hbt g(Context context, String str, String str2) {
        return f(str2, new hbd(context.getApplicationContext(), str, str2, 0));
    }

    public static hbt h(Context context, int i) {
        return i(context, i, k(context, i));
    }

    public static hbt i(Context context, int i, String str) {
        return f(str, new mid(new WeakReference(context), context.getApplicationContext(), i, str, 1));
    }

    public static hbt j(final Context context, final String str, final String str2) {
        return f(str2, new Callable() { // from class: hbc
            /* JADX WARN: Can't wrap try/catch for region: R(12:58|(1:60)|61|(7:70|(1:72)(1:86)|(2:76|(1:78))|79|80|81|82)|87|(1:89)(1:91)|90|(3:74|76|(0))|79|80|81|82) */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00bc, code lost:
            
                if (r7 == null) goto L53;
             */
            /* JADX WARN: Code restructure failed: missing block: B:84:0x01c3, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:85:0x01c4, code lost:
            
                defpackage.hhw.b("LottieFetchResult close failed ", r0);
             */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0199 A[Catch: all -> 0x0254, Exception -> 0x0257, TryCatch #3 {Exception -> 0x0257, blocks: (B:56:0x00e2, B:58:0x00e8, B:61:0x00f9, B:63:0x0101, B:65:0x0109, B:67:0x0111, B:70:0x0122, B:72:0x0126, B:74:0x0169, B:76:0x016d, B:78:0x0199, B:79:0x01bd, B:86:0x013c, B:87:0x0141, B:89:0x0145, B:91:0x015c, B:92:0x01cc, B:94:0x01d0, B:97:0x0243, B:103:0x01d7, B:110:0x020e, B:117:0x0238, B:121:0x023a), top: B:55:0x00e2 }] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 650
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.hbc.call():java.lang.Object");
            }
        });
    }

    public static String k(Context context, int i) {
        String str;
        int i2 = context.getResources().getConfiguration().uiMode & 48;
        StringBuilder sb = new StringBuilder("rawRes");
        if (i2 != 32) {
            str = "_day_";
        } else {
            str = "_night_";
        }
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static void l() {
        ArrayList arrayList = new ArrayList(b);
        for (int i = 0; i < arrayList.size(); i++) {
            ((hbu) arrayList.get(i)).a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x0328, code lost:
    
        if (r0 < 0) goto L149;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x004a. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static defpackage.hbr m(defpackage.hhr r32, java.lang.String r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbf.m(hhr, java.lang.String, boolean):hbr");
    }

    private static Boolean n(asqw asqwVar) {
        try {
            asrk asrkVar = new asrk(new asrh(asqwVar));
            byte[] bArr = c;
            int length = bArr.length;
            for (int i = 0; i < 4; i++) {
                if (asrkVar.d() != bArr[i]) {
                    return false;
                }
            }
            asrkVar.close();
            return true;
        } catch (Exception unused) {
            int i2 = hhw.a;
            return false;
        } catch (NoSuchMethodError unused2) {
            return false;
        }
    }
}
