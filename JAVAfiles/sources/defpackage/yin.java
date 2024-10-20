package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.knowledge.hobbes.chat.common.PredictorResult;
import j$.util.Optional;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yin {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils");
    public final armf b;
    public final anen c;
    public final anen d;
    public final anen e;
    public final xnv f;
    public final Context g;
    private final Map h = new HashMap();

    public yin(Context context, armf armfVar, anen anenVar, anen anenVar2, anen anenVar3, xnv xnvVar) {
        this.g = context;
        this.b = armfVar;
        this.c = anenVar;
        this.d = anenVar2;
        this.e = anenVar3;
        this.f = xnvVar;
        albo.D(new yim(this, 0));
        new akbj(new vbo(this, 15), anenVar2);
    }

    public static alog g(String str) {
        anna d = anna.e(':').i().d();
        alob alobVar = new alob();
        for (String str2 : anna.e(',').i().d().a(str)) {
            if (!str2.isEmpty()) {
                List c = d.c(str2);
                if (c.size() == 2) {
                    aozy createBuilder = alcs.a.createBuilder();
                    aozy createBuilder2 = alct.a.createBuilder();
                    String str3 = (String) c.get(0);
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    alct alctVar = (alct) createBuilder2.b;
                    str3.getClass();
                    alctVar.b |= 1;
                    alctVar.c = str3;
                    String str4 = (String) c.get(1);
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    alct alctVar2 = (alct) createBuilder2.b;
                    str4.getClass();
                    alctVar2.b = 2 | alctVar2.b;
                    alctVar2.d = str4;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    alcs alcsVar = (alcs) createBuilder.b;
                    alct alctVar3 = (alct) createBuilder2.s();
                    alctVar3.getClass();
                    alcsVar.c = alctVar3;
                    alcsVar.b |= 1;
                    alobVar.h((alcs) createBuilder.s());
                } else if (c.size() == 1) {
                    aozy createBuilder3 = alcs.a.createBuilder();
                    String str5 = (String) c.get(0);
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    alcs alcsVar2 = (alcs) createBuilder3.b;
                    str5.getClass();
                    alcsVar2.b = 2 | alcsVar2.b;
                    alcsVar2.d = str5;
                    alobVar.h((alcs) createBuilder3.s());
                } else {
                    throw new IllegalArgumentException(String.format("Could not build file-specs from string: %s", str));
                }
            }
        }
        return alobVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final akul k() {
        akul e;
        if (((Boolean) yig.j.e()).booleanValue() && (TextUtils.isEmpty((CharSequence) yig.n.e()) || TextUtils.isEmpty((CharSequence) yig.o.e()))) {
            return aktp.ag(Optional.empty());
        }
        if (TextUtils.isEmpty((CharSequence) yiq.l.e())) {
            e = aktp.ag(Optional.empty());
        } else {
            alog g = g((String) yiq.l.e());
            if (((alsx) g).c != 1) {
                alvw i = a.i();
                i.X(alwp.a, "Bugle");
                ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetDownloadedLinguaModelConfigAsync", 1157, "SmartSuggestionConfigUtils.java")).t("Bad file-spec flag for in-apk multi-task config: %s", yiq.l.e());
                e = aktp.ag(Optional.empty());
            } else {
                e = new akuk(albo.f((alcs) g.get(0))).d(new mkf(this, g, 3), this.d).f().e(FileNotFoundException.class, new yez(g, 8), this.d).e(IOException.class, new yez(g, 9), this.d);
            }
        }
        return e.h(new yez(this, 4), this.c);
    }

    private static alcs l(String str, String str2, Optional optional) {
        aozy createBuilder = alcs.a.createBuilder();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            aozy createBuilder2 = alct.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar = createBuilder2.b;
            alct alctVar = (alct) apagVar;
            str.getClass();
            alctVar.b |= 1;
            alctVar.c = str;
            if (!apagVar.isMutable()) {
                createBuilder2.u();
            }
            alct alctVar2 = (alct) createBuilder2.b;
            str2.getClass();
            alctVar2.b |= 2;
            alctVar2.d = str2;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            alcs alcsVar = (alcs) createBuilder.b;
            alct alctVar3 = (alct) createBuilder2.s();
            alctVar3.getClass();
            alcsVar.c = alctVar3;
            alcsVar.b |= 1;
        }
        if (optional.isPresent()) {
            Object obj = optional.get();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            alcs alcsVar2 = (alcs) createBuilder.b;
            alcsVar2.b |= 2;
            alcsVar2.d = (String) obj;
        }
        return (alcs) createBuilder.s();
    }

    private static aloi m(String str) {
        anna d = anna.e('|').i().d();
        anna d2 = anna.e(':').i().d();
        aloh alohVar = new aloh();
        for (String str2 : anna.e(',').i().d().a(str)) {
            if (!str2.isEmpty()) {
                List c = d.c(str2);
                if (c.size() == 2) {
                    String str3 = (String) c.get(0);
                    String str4 = (String) c.get(1);
                    List c2 = d2.c(str3);
                    if (c2.size() == 2) {
                        aozy createBuilder = alcs.a.createBuilder();
                        aozy createBuilder2 = alct.a.createBuilder();
                        String str5 = (String) c2.get(0);
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        alct alctVar = (alct) createBuilder2.b;
                        str5.getClass();
                        alctVar.b |= 1;
                        alctVar.c = str5;
                        String str6 = (String) c2.get(1);
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        alct alctVar2 = (alct) createBuilder2.b;
                        str6.getClass();
                        alctVar2.b = 2 | alctVar2.b;
                        alctVar2.d = str6;
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        alcs alcsVar = (alcs) createBuilder.b;
                        alct alctVar3 = (alct) createBuilder2.s();
                        alctVar3.getClass();
                        alcsVar.c = alctVar3;
                        alcsVar.b |= 1;
                        alohVar.b(str4, (alcs) createBuilder.s());
                    } else if (c2.size() == 1) {
                        aozy createBuilder3 = alcs.a.createBuilder();
                        String str7 = (String) c.get(0);
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        alcs alcsVar2 = (alcs) createBuilder3.b;
                        str7.getClass();
                        alcsVar2.b = 2 | alcsVar2.b;
                        alcsVar2.d = str7;
                        alohVar.b(str4, (alcs) createBuilder3.s());
                    } else {
                        throw new IllegalArgumentException(String.format("Could not build file-specs from string: %s because of invalid non-role: %s", str, str3));
                    }
                } else {
                    throw new IllegalArgumentException(String.format("Could not build file-specs from string: %s", str));
                }
            }
        }
        return alohVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    private final Optional n() {
        Optional empty;
        if (((Boolean) yig.j.e()).booleanValue() && (TextUtils.isEmpty((CharSequence) yig.n.e()) || TextUtils.isEmpty((CharSequence) yig.o.e()))) {
            return Optional.empty();
        }
        if (TextUtils.isEmpty((CharSequence) yiq.l.e())) {
            empty = Optional.empty();
        } else {
            alog g = g((String) yiq.l.e());
            if (((alsx) g).c != 1) {
                alvw i = a.i();
                i.X(alwp.a, "Bugle");
                ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetDownloadedLinguaModelConfig", 1122, "SmartSuggestionConfigUtils.java")).t("Bad file-spec flag for in-apk multi-task config: %s", yiq.l.e());
                empty = Optional.empty();
            } else {
                try {
                    InputStream e = albo.e((alcs) g.get(0));
                    try {
                        Optional h = h(e, g);
                        if (e != null) {
                            e.close();
                        }
                        empty = h;
                    } catch (Throwable th) {
                        if (e != null) {
                            try {
                                e.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e2) {
                    alvw i2 = a.i();
                    i2.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) ((alvg) i2).g(e2)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetDownloadedLinguaModelConfig", 1130, "SmartSuggestionConfigUtils.java")).t("Could not find file: %s", albo.g((alcs) g.get(0)));
                    empty = Optional.empty();
                } catch (IOException e3) {
                    alvw i3 = a.i();
                    i3.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) ((alvg) i3).g(e3)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetDownloadedLinguaModelConfig", 1134, "SmartSuggestionConfigUtils.java")).t("Error reading FileSpec: %s", albo.g((alcs) g.get(0)));
                    empty = Optional.empty();
                }
            }
        }
        return i(empty);
    }

    private final String o(String str) {
        InputStream inputStream;
        Exception e;
        File cacheDir = this.g.getCacheDir();
        String concat = "smarts_cache_item_".concat(str);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                if (this.h.containsKey(str) && ((File) this.h.get(str)).exists()) {
                    return ((File) this.h.get(str)).getAbsolutePath();
                }
                inputStream = this.g.getResources().openRawResource(this.g.getResources().getIdentifier(str, "raw", this.g.getPackageName()));
                try {
                    File file = new File(cacheDir, concat);
                    if (file.exists() && file.length() > 0) {
                        if (inputStream.available() != file.length()) {
                            if (file.delete()) {
                                file = new File(cacheDir, concat);
                            }
                        } else {
                            this.h.put(str, file);
                            try {
                                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                                long length = randomAccessFile.length();
                                randomAccessFile.setLength(1 + length);
                                randomAccessFile.setLength(length);
                                randomAccessFile.close();
                            } catch (IOException unused) {
                            }
                            String absolutePath = file.getAbsolutePath();
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused2) {
                                }
                            }
                            return absolutePath;
                        }
                    }
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        amcp.a(inputStream, fileOutputStream2);
                        inputStream.close();
                        fileOutputStream2.close();
                        this.h.put(str, file);
                        String absolutePath2 = file.getAbsolutePath();
                        try {
                            fileOutputStream2.close();
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        } catch (IOException unused3) {
                        }
                        return absolutePath2;
                    } catch (Exception e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        alvw h = a.h();
                        h.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) ((alvg) h).g(e)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "getFileFromResources", 1347, "SmartSuggestionConfigUtils.java")).t("SmartSuggestionConfigUtils: Error reading %s", str);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused4) {
                                return "";
                            }
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        return "";
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused5) {
                                throw th;
                            }
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Exception e4) {
                e = e4;
                inputStream = null;
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private final String p() {
        return o("multi_lite_9head_20200301_model");
    }

    private final Optional q(int i) {
        if (!Locale.ENGLISH.getLanguage().equals(yhx.b(this.g).getLanguage())) {
            return Optional.empty();
        }
        if (i == 3) {
            return Optional.of(o("sensitive_classifier_20191012"));
        }
        return Optional.of(o("sensitive_classifier_20171221_whitelisted_v2"));
    }

    private static aozy r(String str, double d) {
        aozy createBuilder = alcw.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        alcw alcwVar = (alcw) apagVar;
        alcwVar.b |= 1;
        alcwVar.e = str;
        float f = (float) d;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        alcw alcwVar2 = (alcw) createBuilder.b;
        alcwVar2.c = 3;
        alcwVar2.d = Float.valueOf(f);
        return createBuilder;
    }

    private static aozy s(String str, int i) {
        aozy createBuilder = alcx.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        alcx alcxVar = (alcx) apagVar;
        alcxVar.b |= 1;
        alcxVar.c = str;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        alcx alcxVar2 = (alcx) createBuilder.b;
        alcxVar2.b |= 2;
        alcxVar2.d = i;
        return createBuilder;
    }

    private static final aozy t() {
        aozy createBuilder = aldh.a.createBuilder();
        int intValue = ((Integer) yie.a.e()).intValue();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aldh aldhVar = (aldh) createBuilder.b;
        aldhVar.b |= 1;
        aldhVar.e = intValue;
        return createBuilder;
    }

    public final akul a(boolean z) {
        akul ag;
        aozy createBuilder = aldb.a.createBuilder();
        if (z) {
            ag = k();
        } else {
            ag = aktp.ag(Optional.empty());
        }
        return ag.i(new xfv(this, createBuilder, 15), this.d);
    }

    public final akul b() {
        return k().h(new xpm(this, m((String) yiq.p.e()), 13, null), this.d).h(new yeb(14), this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public final aldb c(boolean z) {
        InputStream e;
        aozy createBuilder = aldb.a.createBuilder();
        if (z) {
            Optional n = n();
            createBuilder.getClass();
            n.ifPresent(new ybf(createBuilder, 17));
        }
        alog g = g((String) yig.H.e());
        int i = ((alsx) g).c;
        for (int i2 = 0; i2 < i; i2++) {
            alcs alcsVar = (alcs) g.get(i2);
            try {
                e = albo.e(alcsVar);
            } catch (FileNotFoundException e2) {
                alvw i3 = a.i();
                i3.X(alwp.a, "Bugle");
                ((alvg) ((alvg) ((alvg) i3).g(e2)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetModelBasedProviders", 544, "SmartSuggestionConfigUtils.java")).t("Could not find file: %s", albo.g(alcsVar));
            } catch (IOException e3) {
                alvw i4 = a.i();
                i4.X(alwp.a, "Bugle");
                ((alvg) ((alvg) ((alvg) i4).g(e3)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetModelBasedProviders", 547, "SmartSuggestionConfigUtils.java")).t("Error reading FileSpec: %s", albo.g(alcsVar));
            }
            try {
                createBuilder.aC(((aldb) apag.parseFrom(aldb.a, e, aozs.a())).b);
                if (e != null) {
                    e.close();
                }
            } catch (Throwable th) {
                if (e != null) {
                    try {
                        e.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
                break;
            }
        }
        return (aldb) createBuilder.s();
    }

    @Deprecated
    public final aldb d() {
        aloi m = m((String) yiq.p.e());
        aozy createBuilder = aldb.a.createBuilder();
        createBuilder.aC(f(n(), m));
        return (aldb) createBuilder.s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final aldo e(aldb aldbVar) {
        Optional empty;
        Optional empty2;
        aozy createBuilder = aldo.a.createBuilder();
        if (aldbVar.b.size() > 0) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            aldo aldoVar = (aldo) createBuilder.b;
            aldbVar.getClass();
            aldoVar.c = aldbVar;
            aldoVar.b |= 2;
        }
        alog g = g((String) yig.G.e());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aldo aldoVar2 = (aldo) createBuilder.b;
        apax apaxVar = aldoVar2.d;
        if (!apaxVar.c()) {
            aldoVar2.d = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(g, aldoVar2.d);
        if (((Integer) yig.u.e()).intValue() > 0) {
            aozy createBuilder2 = aldm.a.createBuilder();
            int intValue = ((Integer) yig.u.e()).intValue();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            aldm aldmVar = (aldm) createBuilder2.b;
            aldmVar.b |= 1;
            aldmVar.c = intValue;
            empty = Optional.of((aldm) createBuilder2.s());
        } else {
            empty = Optional.empty();
        }
        createBuilder.getClass();
        empty.ifPresent(new ybf(createBuilder, 15));
        alog g2 = g((String) yis.b.e());
        if (!g2.isEmpty()) {
            alcs alcsVar = (alcs) g2.get(0);
            aldp aldpVar = aldp.a;
            try {
                InputStream e = albo.e(alcsVar);
                try {
                    aldp aldpVar2 = (aldp) apag.parseFrom(aldp.a, e, aozs.a());
                    if (e != null) {
                        e.close();
                    }
                    if (((Long) yis.c.e()).longValue() != 0) {
                        aozy builder = aldpVar2.toBuilder();
                        long longValue = ((Long) yis.c.e()).longValue();
                        if (!builder.b.isMutable()) {
                            builder.u();
                        }
                        aldp aldpVar3 = (aldp) builder.b;
                        aldpVar3.b |= 1;
                        aldpVar3.c = longValue;
                        aldpVar2 = (aldp) builder.s();
                    }
                    if (((Integer) yis.d.e()).intValue() != -1) {
                        aozy builder2 = aldpVar2.toBuilder();
                        int intValue2 = ((Integer) yis.d.e()).intValue();
                        if (!builder2.b.isMutable()) {
                            builder2.u();
                        }
                        aldp aldpVar4 = (aldp) builder2.b;
                        aldpVar4.b |= 4;
                        aldpVar4.d = intValue2;
                        aldpVar2 = (aldp) builder2.s();
                    }
                    if (((Integer) yis.e.e()).intValue() != -1) {
                        aozy builder3 = aldpVar2.toBuilder();
                        int intValue3 = ((Integer) yis.e.e()).intValue();
                        if (!builder3.b.isMutable()) {
                            builder3.u();
                        }
                        aldp aldpVar5 = (aldp) builder3.b;
                        aldpVar5.b |= 8;
                        aldpVar5.e = intValue3;
                        aldpVar2 = (aldp) builder3.s();
                    }
                    empty2 = Optional.of(aldpVar2);
                } catch (Throwable th) {
                    if (e != null) {
                        try {
                            e.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                alvw h = a.h();
                h.X(alwp.a, "Bugle");
                ((alvg) ((alvg) ((alvg) h).g(e2)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetTemporalSuggestionProviderConfig", 761, "SmartSuggestionConfigUtils.java")).t("Could not find TemporalSuggestionProviderConfig file: %s", yis.b.e());
                empty2 = Optional.empty();
            } catch (IOException e3) {
                alvw h2 = a.h();
                h2.X(alwp.a, "Bugle");
                ((alvg) ((alvg) ((alvg) h2).g(e3)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetTemporalSuggestionProviderConfig", 766, "SmartSuggestionConfigUtils.java")).t("Error reading TemporalSuggestionProviderConfig FileSpec: %s", yis.b.e());
                empty2 = Optional.empty();
            }
        } else {
            empty2 = Optional.empty();
        }
        empty2.ifPresent(new ybf(createBuilder, 16));
        boolean a2 = lbp.a();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aldo aldoVar3 = (aldo) createBuilder.b;
        aldoVar3.b |= 32;
        aldoVar3.g = a2;
        boolean a3 = qrl.a();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aldo aldoVar4 = (aldo) createBuilder.b;
        aldoVar4.b |= 64;
        aldoVar4.h = a3;
        aozy createBuilder3 = aldl.a.createBuilder();
        boolean booleanValue = ((Boolean) ((utz) abat.a.get()).e()).booleanValue();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        apag apagVar = createBuilder3.b;
        aldl aldlVar = (aldl) apagVar;
        aldlVar.b |= 1;
        aldlVar.c = booleanValue;
        if (!apagVar.isMutable()) {
            createBuilder3.u();
        }
        aldl aldlVar2 = (aldl) createBuilder3.b;
        aldlVar2.b |= 2;
        aldlVar2.d = false;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aldo aldoVar5 = (aldo) createBuilder.b;
        aldl aldlVar3 = (aldl) createBuilder3.s();
        aldlVar3.getClass();
        aldoVar5.i = aldlVar3;
        aldoVar5.b |= 128;
        return (aldo) createBuilder.s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final alog f(Optional optional, aloi aloiVar) {
        InputStream e;
        aloh alohVar = new aloh();
        optional.ifPresent(new ybf(alohVar, 14));
        aluq listIterator = aloiVar.u().listIterator();
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            alog<alcs> a2 = aloiVar.a(str);
            try {
                alob alobVar = new alob();
                for (alcs alcsVar : a2) {
                    try {
                        try {
                            try {
                                e = albo.e(alcsVar);
                            } catch (FileNotFoundException e2) {
                                alvw i = a.i();
                                i.X(alwp.a, "Bugle");
                                ((alvg) ((alvg) ((alvg) i).g(e2)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "parseModelBasedProviderConfigsFromFileSpecsWithBackoff", 896, "SmartSuggestionConfigUtils.java")).t("Could not find file: %s", albo.g(alcsVar));
                            }
                        } catch (IOException e3) {
                            alvw i2 = a.i();
                            i2.X(alwp.a, "Bugle");
                            ((alvg) ((alvg) ((alvg) i2).g(e3)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "parseModelBasedProviderConfigsFromFileSpecsWithBackoff", 899, "SmartSuggestionConfigUtils.java")).t("Error reading FileSpec: %s", albo.g(alcsVar));
                        }
                        try {
                            aldb aldbVar = (aldb) apag.parseFrom(aldb.a, e, aozs.a());
                            if (aldbVar.b.size() == 1) {
                                alda aldaVar = (alda) aldbVar.b.get(0);
                                if (aldaVar.b.size() == 1) {
                                    alobVar.h(aldaVar);
                                    if (e != null) {
                                        e.close();
                                    }
                                } else {
                                    throw new IllegalStateException("ModelBasedProviderConfig must have exactly one ModelConfigItem.");
                                }
                            } else {
                                throw new yik();
                            }
                        } catch (Throwable th) {
                            if (e != null) {
                                try {
                                    e.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                            break;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        alvw h = a.h();
                        h.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) ((alvg) h).g(e)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "getCascadedModelBasedProviderConfigsFromBaseModel", 849, "SmartSuggestionConfigUtils.java")).t("Failed to parse ModelBasedProvidersConfig for role: %s", str);
                    }
                }
                alohVar.c(str, alobVar.g());
            } catch (Exception e5) {
                e = e5;
            }
        }
        aloi a3 = alohVar.a();
        alob alobVar2 = new alob();
        aluq listIterator2 = a3.u().listIterator();
        while (listIterator2.hasNext()) {
            String str2 = (String) listIterator2.next();
            alog a4 = a3.a(str2);
            if (a4.isEmpty()) {
                alvw i3 = a.i();
                i3.X(alwp.a, "Bugle");
                ((alvg) ((alvg) i3).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "getBackoffCascades", 929, "SmartSuggestionConfigUtils.java")).t("Failed to create backoff cascade with role: %s", str2);
            } else {
                aozy builder = ((aldc) ((alda) a4.get(0)).b.get(0)).toBuilder();
                int i4 = 1;
                while (i4 < a4.size()) {
                    aozy builder2 = ((aldc) ((alda) a4.get(i4)).b.get(0)).toBuilder();
                    if (!builder2.b.isMutable()) {
                        builder2.u();
                    }
                    aldc aldcVar = (aldc) builder2.b;
                    aldc aldcVar2 = (aldc) builder.s();
                    aldcVar2.getClass();
                    aldcVar.e = aldcVar2;
                    aldcVar.b |= 2;
                    i4++;
                    builder = builder2;
                }
                aozy createBuilder = alda.a.createBuilder();
                createBuilder.br(builder);
                alobVar2.h((alda) createBuilder.s());
            }
        }
        return alobVar2.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional h(InputStream inputStream, alog alogVar) {
        if (inputStream == null) {
            alvw i = a.i();
            i.X(alwp.a, "Bugle");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "getDownloadedLinguaModelConfigFromInputStream", 1194, "SmartSuggestionConfigUtils.java")).t("Null fileInputStream for file: %s", albo.g((alcs) alogVar.get(0)));
            return Optional.empty();
        }
        aozy builder = ((alcy) apag.parseFrom(alcy.a, inputStream, aozs.a())).toBuilder();
        if (!builder.b.isMutable()) {
            builder.u();
        }
        alcy alcyVar = (alcy) builder.b;
        alcyVar.g = 2;
        alcyVar.b |= 4;
        aozy createBuilder = alcs.a.createBuilder();
        String p = p();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        alcs alcsVar = (alcs) createBuilder.b;
        p.getClass();
        alcsVar.b = 2 | alcsVar.b;
        alcsVar.d = p;
        if (!builder.b.isMutable()) {
            builder.u();
        }
        alcy alcyVar2 = (alcy) builder.b;
        alcs alcsVar2 = (alcs) createBuilder.s();
        alcsVar2.getClass();
        alcyVar2.c = alcsVar2;
        alcyVar2.b |= 1;
        return Optional.of((alcy) builder.s());
    }

    public final Optional i(Optional optional) {
        alcy alcyVar;
        if (optional.isPresent()) {
            alcyVar = (alcy) optional.get();
        } else {
            aozy createBuilder = alcy.a.createBuilder();
            aozy createBuilder2 = alcs.a.createBuilder();
            String p = p();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            alcs alcsVar = (alcs) createBuilder2.b;
            p.getClass();
            alcsVar.b |= 2;
            alcsVar.d = p;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            alcy alcyVar2 = (alcy) createBuilder.b;
            alcs alcsVar2 = (alcs) createBuilder2.s();
            alcsVar2.getClass();
            alcyVar2.c = alcsVar2;
            alcyVar2.b |= 1;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            alcy alcyVar3 = (alcy) apagVar;
            alcyVar3.g = 2;
            alcyVar3.b |= 4;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            alcy alcyVar4 = (alcy) createBuilder.b;
            alcyVar4.b |= 2;
            alcyVar4.f = 0;
            createBuilder.bp(r("empirical_probability_factor", ((Double) yiq.m.e()).doubleValue()));
            createBuilder.bp(r("diversification_distance_threshold", ((Double) yiq.o.e()).doubleValue()));
            createBuilder.bp(r("confidence_threshold", ((Double) yiq.n.e()).doubleValue()));
            createBuilder.bq(s("SPAM", ((Integer) yig.b.e()).intValue() * ((Integer) yig.x.e()).intValue()));
            createBuilder.bq(s(PredictorResult.Types.REPLY_SUGGESTION, ((Integer) yig.b.e()).intValue() * ((Integer) yig.x.e()).intValue()));
            alcyVar = (alcy) createBuilder.s();
        }
        aozy createBuilder3 = alda.a.createBuilder();
        aozy createBuilder4 = aldc.a.createBuilder();
        if (!createBuilder4.b.isMutable()) {
            createBuilder4.u();
        }
        aldc aldcVar = (aldc) createBuilder4.b;
        alcyVar.getClass();
        aldcVar.d = alcyVar;
        aldcVar.c = 7;
        createBuilder3.br(createBuilder4);
        return Optional.of((alda) createBuilder3.s());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final aozy j() {
        aldh aldhVar;
        alcs alcsVar;
        Optional of;
        aozy createBuilder = aldi.a.createBuilder();
        aozy createBuilder2 = alcv.a.createBuilder();
        float floatValue = ((Double) yig.k.e()).floatValue();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        alcv alcvVar = (alcv) createBuilder2.b;
        alcvVar.b |= 1;
        alcvVar.c = floatValue;
        List d = ytd.d((String) yig.r.e());
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        alcv alcvVar2 = (alcv) createBuilder2.b;
        apax apaxVar = alcvVar2.d;
        if (!apaxVar.c()) {
            alcvVar2.d = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(d, alcvVar2.d);
        alcv alcvVar3 = (alcv) createBuilder2.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aldi aldiVar = (aldi) createBuilder.b;
        alcvVar3.getClass();
        aldiVar.c = alcvVar3;
        aldiVar.b |= 1;
        if (((Boolean) yie.d.e()).booleanValue()) {
            aozy t = t();
            aozy createBuilder3 = alcy.a.createBuilder();
            alcs l = l((String) yie.b.e(), (String) yie.c.e(), q(3));
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            alcy alcyVar = (alcy) createBuilder3.b;
            l.getClass();
            alcyVar.c = l;
            alcyVar.b |= 1;
            aozy createBuilder4 = alcx.a.createBuilder();
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            apag apagVar = createBuilder4.b;
            alcx alcxVar = (alcx) apagVar;
            alcxVar.b |= 1;
            alcxVar.c = PredictorResult.Types.REPLY_SUGGESTION;
            if (!apagVar.isMutable()) {
                createBuilder4.u();
            }
            apag apagVar2 = createBuilder4.b;
            alcx alcxVar2 = (alcx) apagVar2;
            alcxVar2.b |= 2;
            alcxVar2.d = 2;
            if (!apagVar2.isMutable()) {
                createBuilder4.u();
            }
            alcx alcxVar3 = (alcx) createBuilder4.b;
            alcxVar3.b |= 4;
            alcxVar3.e = 0.5d;
            createBuilder3.bq(createBuilder4);
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            alcy alcyVar2 = (alcy) createBuilder3.b;
            alcyVar2.g = 2;
            alcyVar2.b |= 4;
            if (!t.b.isMutable()) {
                t.u();
            }
            aldh aldhVar2 = (aldh) t.b;
            alcy alcyVar3 = (alcy) createBuilder3.s();
            aldh aldhVar3 = aldh.a;
            alcyVar3.getClass();
            aldhVar2.d = alcyVar3;
            aldhVar2.c = 3;
            aldhVar = (aldh) t.s();
        } else {
            aozy t2 = t();
            alcs l2 = l((String) yie.b.e(), (String) yie.c.e(), q(2));
            if (!t2.b.isMutable()) {
                t2.u();
            }
            aldh aldhVar4 = (aldh) t2.b;
            aldh aldhVar5 = aldh.a;
            l2.getClass();
            aldhVar4.d = l2;
            aldhVar4.c = 2;
            aldhVar = (aldh) t2.s();
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aldi aldiVar2 = (aldi) createBuilder.b;
        aldhVar.getClass();
        aldiVar2.d = aldhVar;
        aldiVar2.b |= 2;
        aozy createBuilder5 = aldn.a.createBuilder();
        String str = (String) yig.f.e();
        if (!TextUtils.isEmpty(str)) {
            List c = anna.e(',').c(str);
            if (!createBuilder5.b.isMutable()) {
                createBuilder5.u();
            }
            aldn aldnVar = (aldn) createBuilder5.b;
            apax apaxVar2 = aldnVar.b;
            if (!apaxVar2.c()) {
                aldnVar.b = apag.mutableCopy(apaxVar2);
            }
            aoyj.addAll(c, aldnVar.b);
        }
        String str2 = (String) yig.g.e();
        if (!TextUtils.isEmpty(str2)) {
            List c2 = anna.e(',').c(str2);
            if (!createBuilder5.b.isMutable()) {
                createBuilder5.u();
            }
            aldn aldnVar2 = (aldn) createBuilder5.b;
            apax apaxVar3 = aldnVar2.c;
            if (!apaxVar3.c()) {
                aldnVar2.c = apag.mutableCopy(apaxVar3);
            }
            aoyj.addAll(c2, aldnVar2.c);
        }
        String str3 = (String) yig.h.e();
        if (!TextUtils.isEmpty(str3)) {
            List c3 = anna.e(',').c(str3);
            if (!createBuilder5.b.isMutable()) {
                createBuilder5.u();
            }
            aldn aldnVar3 = (aldn) createBuilder5.b;
            apax apaxVar4 = aldnVar3.d;
            if (!apaxVar4.c()) {
                aldnVar3.d = apag.mutableCopy(apaxVar4);
            }
            aoyj.addAll(c3, aldnVar3.d);
        }
        String str4 = (String) yig.i.e();
        if (!TextUtils.isEmpty(str4)) {
            List c4 = anna.e(',').c(str4);
            if (!createBuilder5.b.isMutable()) {
                createBuilder5.u();
            }
            aldn aldnVar4 = (aldn) createBuilder5.b;
            apax apaxVar5 = aldnVar4.e;
            if (!apaxVar5.c()) {
                aldnVar4.e = apag.mutableCopy(apaxVar5);
            }
            aoyj.addAll(c4, aldnVar4.e);
        }
        aldn aldnVar5 = (aldn) createBuilder5.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aldi aldiVar3 = (aldi) createBuilder.b;
        aldnVar5.getClass();
        aldiVar3.e = aldnVar5;
        aldiVar3.b |= 4;
        String str5 = (String) yig.y.e();
        if (TextUtils.isEmpty(str5)) {
            alcsVar = alcs.a;
        } else {
            alog g = g(str5);
            if (g.isEmpty()) {
                alcsVar = alcs.a;
            } else {
                alcsVar = (alcs) g.get(0);
            }
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aldi aldiVar4 = (aldi) createBuilder.b;
        alcsVar.getClass();
        aldiVar4.g = alcsVar;
        aldiVar4.b |= 16;
        boolean booleanValue = ((Boolean) yig.e.e()).booleanValue();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aldi aldiVar5 = (aldi) createBuilder.b;
        aldiVar5.b |= 64;
        aldiVar5.h = booleanValue;
        aozy createBuilder6 = aldf.a.createBuilder();
        createBuilder6.aE(aqbc.SPAM);
        createBuilder6.aE(aqbc.SILENT);
        createBuilder6.aE(aqbc.BUSINESS_MESSAGE);
        createBuilder6.aE(aqbc.CALENDAR);
        aldg aldgVar = aldg.a;
        if (!createBuilder6.b.isMutable()) {
            createBuilder6.u();
        }
        aldf aldfVar = (aldf) createBuilder6.b;
        aldgVar.getClass();
        aldfVar.f = aldgVar;
        aldfVar.b |= 2;
        if (((Boolean) yie.e.e()).booleanValue()) {
            createBuilder6.aE(aqbc.STARRING);
        }
        if (((Boolean) yiq.b.e()).booleanValue()) {
            if (((Boolean) yiq.b.e()).booleanValue()) {
                try {
                    alog g2 = g((String) yiq.c.e());
                    if (((alsx) g2).c != 1) {
                        alvw i = a.i();
                        i.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetModelBasedRerankerConfig", 385, "SmartSuggestionConfigUtils.java")).t("Found more than one flag for model based reranker config: %s", yiq.c.e());
                        of = Optional.empty();
                    } else {
                        aozy createBuilder7 = alde.a.createBuilder();
                        apaq apaqVar = new apaq(((yil) apag.parseFrom(yil.b, (byte[]) yiq.v.e(), aozs.a())).c, yil.a);
                        if (!createBuilder7.b.isMutable()) {
                            createBuilder7.u();
                        }
                        alde aldeVar = (alde) createBuilder7.b;
                        apao apaoVar = aldeVar.l;
                        if (!apaoVar.c()) {
                            aldeVar.l = apag.mutableCopy(apaoVar);
                        }
                        Iterator<E> it = apaqVar.iterator();
                        while (it.hasNext()) {
                            aldeVar.l.g(((aqbc) it.next()).a());
                        }
                        alcs alcsVar2 = (alcs) g2.get(0);
                        if (!createBuilder7.b.isMutable()) {
                            createBuilder7.u();
                        }
                        alde aldeVar2 = (alde) createBuilder7.b;
                        aldeVar2.c = alcsVar2;
                        aldeVar2.b |= 1;
                        int intValue = ((Integer) yiq.e.e()).intValue();
                        if (!createBuilder7.b.isMutable()) {
                            createBuilder7.u();
                        }
                        alde aldeVar3 = (alde) createBuilder7.b;
                        aldeVar3.b |= 2;
                        aldeVar3.d = intValue;
                        int Y = a.Y(((Integer) yiq.f.e()).intValue());
                        if (!createBuilder7.b.isMutable()) {
                            createBuilder7.u();
                        }
                        alde aldeVar4 = (alde) createBuilder7.b;
                        int i2 = Y - 1;
                        if (Y != 0) {
                            aldeVar4.e = i2;
                            aldeVar4.b |= 4;
                            float floatValue2 = ((Double) yiq.g.e()).floatValue();
                            if (!createBuilder7.b.isMutable()) {
                                createBuilder7.u();
                            }
                            alde aldeVar5 = (alde) createBuilder7.b;
                            aldeVar5.b |= 8;
                            aldeVar5.f = floatValue2;
                            boolean booleanValue2 = ((Boolean) yiq.h.e()).booleanValue();
                            if (!createBuilder7.b.isMutable()) {
                                createBuilder7.u();
                            }
                            alde aldeVar6 = (alde) createBuilder7.b;
                            aldeVar6.b |= 16;
                            aldeVar6.g = booleanValue2;
                            boolean booleanValue3 = ((Boolean) yiq.i.e()).booleanValue();
                            if (!createBuilder7.b.isMutable()) {
                                createBuilder7.u();
                            }
                            alde aldeVar7 = (alde) createBuilder7.b;
                            aldeVar7.b |= 32;
                            aldeVar7.h = booleanValue3;
                            int intValue2 = ((Integer) yiq.j.e()).intValue();
                            if (!createBuilder7.b.isMutable()) {
                                createBuilder7.u();
                            }
                            alde aldeVar8 = (alde) createBuilder7.b;
                            aldeVar8.b |= 64;
                            aldeVar8.i = intValue2;
                            int ab = a.ab(((Integer) yiq.k.e()).intValue());
                            if (!createBuilder7.b.isMutable()) {
                                createBuilder7.u();
                            }
                            alde aldeVar9 = (alde) createBuilder7.b;
                            int i3 = ab - 1;
                            if (ab != 0) {
                                aldeVar9.j = i3;
                                aldeVar9.b |= 128;
                                int ab2 = a.ab(((Integer) yiq.d.e()).intValue());
                                if (!createBuilder7.b.isMutable()) {
                                    createBuilder7.u();
                                }
                                alde aldeVar10 = (alde) createBuilder7.b;
                                int i4 = ab2 - 1;
                                if (ab2 != 0) {
                                    aldeVar10.k = i4;
                                    aldeVar10.b |= 256;
                                    of = Optional.of((alde) createBuilder7.s());
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    }
                } catch (apba e) {
                    alvw h = a.h();
                    h.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) ((alvg) h).g(e)).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetModelBasedRerankerConfig", (char) 411, "SmartSuggestionConfigUtils.java")).q("Could not parse the Reranker Exempt Types list from the Phenotype flag.");
                } catch (IllegalArgumentException unused) {
                    alvw i5 = a.i();
                    i5.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) i5).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionConfigUtils", "maybeGetModelBasedRerankerConfig", 414, "SmartSuggestionConfigUtils.java")).t("Bad file-spec flag for model based reranker config: %s", yiq.c.e());
                }
                of.ifPresent(new ybf(createBuilder6, 13));
            }
            of = Optional.empty();
            of.ifPresent(new ybf(createBuilder6, 13));
        } else {
            aldd alddVar = aldd.a;
            if (!createBuilder6.b.isMutable()) {
                createBuilder6.u();
            }
            aldf aldfVar2 = (aldf) createBuilder6.b;
            alddVar.getClass();
            aldfVar2.d = alddVar;
            aldfVar2.c = 1;
        }
        aldf aldfVar3 = (aldf) createBuilder6.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aldi aldiVar6 = (aldi) createBuilder.b;
        aldfVar3.getClass();
        aldiVar6.i = aldfVar3;
        aldiVar6.b |= 128;
        aldk aldkVar = aldk.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aldi aldiVar7 = (aldi) createBuilder.b;
        aldkVar.getClass();
        aldiVar7.j = aldkVar;
        aldiVar7.b |= 256;
        aozy createBuilder8 = aldj.a.createBuilder();
        boolean booleanValue4 = ((Boolean) ((utz) yiq.t.get()).e()).booleanValue();
        if (!createBuilder8.b.isMutable()) {
            createBuilder8.u();
        }
        aldj aldjVar = (aldj) createBuilder8.b;
        aldjVar.b |= 1;
        aldjVar.c = booleanValue4;
        boolean booleanValue5 = ((Boolean) ((utz) yiq.u.get()).e()).booleanValue();
        if (!createBuilder8.b.isMutable()) {
            createBuilder8.u();
        }
        aldj aldjVar2 = (aldj) createBuilder8.b;
        aldjVar2.b |= 2;
        aldjVar2.d = booleanValue5;
        boolean booleanValue6 = ((Boolean) ((utz) xww.a.get()).e()).booleanValue();
        if (!createBuilder8.b.isMutable()) {
            createBuilder8.u();
        }
        aldj aldjVar3 = (aldj) createBuilder8.b;
        aldjVar3.b |= 4;
        aldjVar3.e = booleanValue6;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aldi aldiVar8 = (aldi) createBuilder.b;
        aldj aldjVar4 = (aldj) createBuilder8.s();
        aldjVar4.getClass();
        aldiVar8.k = aldjVar4;
        aldiVar8.b |= 512;
        return createBuilder;
    }
}
