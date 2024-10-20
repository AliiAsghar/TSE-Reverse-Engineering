package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.net.URLDecoder;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agsv {
    public static final alvi a = alvi.m("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory");
    private static final agsr c = new agsr();
    private static final AtomicBoolean d = new AtomicBoolean(false);
    public final File b;
    private final String e;
    private final alor f;

    public agsv(File file, String str, Map map) {
        this.b = file;
        this.e = str;
        this.f = alzz.ae(map);
    }

    public static agst a(Context context) {
        return (agst) c.a(new agud(context, 1));
    }

    public static File b(Context context) {
        return new File(ahbn.a(context).getCacheDir(), "auto_clean");
    }

    public static File c(Context context) {
        return new File(ahbn.a(context).getFilesDir(), "auto_clean");
    }

    static String d(String str) {
        try {
            return URLDecoder.decode(str, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    public static void e(ahbi ahbiVar, Context context, agst agstVar, File file) {
        ArrayList<File> arrayList = new ArrayList();
        try {
            File[] listFiles = file.getCanonicalFile().listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    try {
                        arrayList.add(file2.getCanonicalFile());
                    } catch (IOException e) {
                        ((alvg) ((alvg) ((alvg) ahbi.a.h()).g(e)).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "listCanonicalFiles", 866, "FileOperationUtils.java")).t("listCanonicalFiles(): failed to get canonical file [%s]", file2.getAbsolutePath());
                    }
                }
            }
        } catch (IOException e2) {
            ((alvg) ((alvg) ((alvg) ahbi.a.h()).g(e2)).h("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "listCanonicalFiles", 854, "FileOperationUtils.java")).t("listCanonicalFiles(): failed to get canonical dir [%s]", file.getAbsolutePath());
        }
        for (File file3 : arrayList) {
            if (file3.isDirectory()) {
                if (!Thread.currentThread().isInterrupted()) {
                    try {
                    } catch (IOException e3) {
                        e = e3;
                        ((alvg) ((alvg) ((alvg) a.i()).g(e)).h("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory", "cleanup", 346, "AutoCleanableDirectory.java")).o();
                    }
                    if (!TextUtils.isEmpty(file3.getName())) {
                        File parentFile = file3.getParentFile();
                        if (parentFile != null && (parentFile.equals(b(context)) || parentFile.equals(c(context)))) {
                            List c2 = anna.e('|').c(d(file3.getName()));
                            String d2 = d((String) c2.get(0));
                            if (!TextUtils.isEmpty(d2)) {
                                anna e4 = anna.e('>');
                                EnumMap enumMap = new EnumMap(agsu.class);
                                for (String str : c2.subList(1, c2.size())) {
                                    List c3 = e4.c(str);
                                    if (c3.size() == 2) {
                                        if (!TextUtils.isEmpty((CharSequence) c3.get(0))) {
                                            try {
                                                enumMap.put((EnumMap) Enum.valueOf(agsu.class, albo.aq((String) c3.get(0))), (agsu) d((String) c3.get(1)));
                                            } catch (IllegalArgumentException e5) {
                                                ((alvg) ((alvg) ((alvg) a.i()).g(e5)).h("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory", "fromFile", 240, "AutoCleanableDirectory.java")).t("Key %s is invalid", c3.get(0));
                                            }
                                        } else {
                                            throw new IOException(String.valueOf(String.valueOf(file3)).concat(" has empty key."));
                                        }
                                    } else {
                                        throw new IOException(String.valueOf(file3) + " has malformed key-value " + str);
                                    }
                                }
                                try {
                                    agsv agsvVar = new agsv(file3, d2, enumMap);
                                    String str2 = (String) agsvVar.f.get(agsu.OS);
                                    if (TextUtils.isEmpty(str2) || agstVar.a.equals(str2)) {
                                        String str3 = (String) agsvVar.f.get(agsu.APP);
                                        if (!TextUtils.isEmpty(str3) && !Long.toString(agstVar.b).equals(str3)) {
                                        }
                                    }
                                    try {
                                        ahbiVar.b(file3);
                                        ((alvg) ((alvg) a.d()).h("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory", "cleanup", 343, "AutoCleanableDirectory.java")).t("%s is deleted", agsvVar);
                                    } catch (IOException e6) {
                                        e = e6;
                                        ((alvg) ((alvg) ((alvg) a.i()).g(e)).h("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory", "cleanup", 346, "AutoCleanableDirectory.java")).o();
                                    }
                                } catch (IllegalArgumentException e7) {
                                    throw new IOException(String.valueOf(String.valueOf(file3)).concat(" has duplicate key."), e7);
                                }
                            } else {
                                throw new IOException(String.valueOf(String.valueOf(file3)).concat(" doesn't have a name entry."));
                            }
                        } else {
                            throw new IOException(String.valueOf(String.valueOf(file3)).concat(" is not located in correct directories."));
                        }
                    } else {
                        throw new IOException(String.valueOf(String.valueOf(file3)).concat(" has empty name."));
                    }
                } else {
                    ((alvg) ((alvg) a.d()).h("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory", "cleanup", 335, "AutoCleanableDirectory.java")).q("Thread interruption detected. Abort deletion.");
                    return;
                }
            }
        }
    }

    public static aiim f(Context context) {
        if (ahbk.a(context) && d.compareAndSet(false, true)) {
            agtj.a().e.schedule(new agqd(context, 4), 10L, TimeUnit.SECONDS);
        }
        return new aiim(ahbn.a(context), a(context));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agsv)) {
            return false;
        }
        agsv agsvVar = (agsv) obj;
        if (Objects.equals(this.b, agsvVar.b) && Objects.equals(this.e, agsvVar.e) && Objects.equals(this.f, agsvVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.e, this.f);
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("directory", this.b);
        aj.b("name", this.e);
        aj.b("properties", this.f);
        return aj.toString();
    }
}
