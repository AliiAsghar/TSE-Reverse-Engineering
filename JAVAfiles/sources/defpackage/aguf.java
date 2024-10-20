package defpackage;

import android.content.Context;
import android.os.Trace;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aguf {
    public static volatile aguf c;
    private final Map g = new tm();
    public static final alvi a = alvi.m("com/google/android/libraries/inputmethod/emoji/data/BundledEmojiListLoader");
    public static final int[] b = {R.string.emoji_category_recent, R.string.emoji_category_emotions, R.string.emoji_category_people, R.string.emoji_category_animals_nature, R.string.emoji_category_food_drink, R.string.emoji_category_travel_places, R.string.emoji_category_activity, R.string.emoji_category_objects, R.string.emoji_category_symbols, R.string.emoji_category_flags};
    private static final agsr e = new agsr();
    private static final agsr f = new agsr();
    static final agyb d = agyd.d("enable_emoji_loader_migration");

    public static alog a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        try {
            anna e2 = anna.e(',');
            alob alobVar = new alob();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    List c2 = e2.c(readLine);
                    int size = c2.size();
                    agun agunVar = null;
                    if (size != 0) {
                        if (size != 1) {
                            agunVar = new agun((String) c2.get(0), alog.n(c2.subList(1, c2.size())));
                        } else {
                            String str = (String) c2.get(0);
                            if (!TextUtils.isEmpty(str)) {
                                agunVar = new agun(str, alsx.a);
                            }
                        }
                    }
                    if (agunVar != null) {
                        alobVar.h(agunVar);
                    }
                } else {
                    alog g = alobVar.g();
                    bufferedReader.close();
                    return g;
                }
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final synchronized ListenableFuture b(Context context, anen anenVar, agxe agxeVar) {
        int i;
        int i2;
        int i3;
        agum agumVar;
        ListenableFuture listenableFuture = (ListenableFuture) this.g.get(agxeVar);
        if (listenableFuture == null) {
            gvf.bd("BundledEmojiListLoader.load");
            try {
                alob alobVar = new alob();
                char c2 = 1;
                if (true != agxg.b(agxg.instance.h)) {
                    i = R.array.emoji_list_raw_resources;
                } else {
                    i = R.array.emoji_list_raw_resources_with_gender_inclusive;
                }
                List b2 = agul.b(context, i);
                alobVar.h(albo.bI(alsx.a));
                int i4 = 0;
                int i5 = 0;
                while (i5 < b2.size()) {
                    int intValue = ((Integer) b2.get(i5)).intValue();
                    if (((Boolean) d.b()).booleanValue()) {
                        gvf.bd("BundledEmojiListLoader.loadFromFileBinaryStringCache");
                        try {
                            Locale locale = Locale.US;
                            Integer valueOf = Integer.valueOf(agxeVar.hashCode());
                            Integer valueOf2 = Integer.valueOf(i5);
                            Integer valueOf3 = Integer.valueOf(agxg.b(agxeVar) ? 1 : 0);
                            Object[] objArr = new Object[3];
                            objArr[i4] = valueOf;
                            objArr[c2] = valueOf2;
                            objArr[2] = valueOf3;
                            String format = String.format(locale, "emoji-filter-flag.v2.%s.%d.%d", objArr);
                            agsw agswVar = (agsw) f.a(new agud(context, i4));
                            ListenableFuture b3 = agswVar.b(format, anenVar);
                            if (agum.b == null) {
                                ((alvg) agum.a.a(agyk.a).h("com/google/android/libraries/inputmethod/emoji/data/EmojiSetSupplier", "getInstance", 85, "EmojiSetSupplier.java")).q("EmojiSetSupplier#initialize() must be called before use.");
                                agumVar = agum.c;
                            } else {
                                agumVar = agum.b;
                            }
                            ListenableFuture listenableFuture2 = agumVar.d;
                            i2 = i5;
                            i3 = 0;
                            ListenableFuture a2 = albo.bY(b3, listenableFuture2).a(new adkp(listenableFuture2, intValue, b3, agxeVar, agswVar, format, anenVar, 2), anenVar);
                            Trace.endSection();
                            alobVar.h(a2);
                            i5 = i2 + 1;
                            i4 = i3;
                            c2 = 1;
                        } finally {
                        }
                    } else {
                        i2 = i5;
                        i3 = i4;
                        gvf.bd("BundledEmojiListLoader.loadFromFile");
                        try {
                            Locale locale2 = Locale.US;
                            Integer valueOf4 = Integer.valueOf(agxeVar.hashCode());
                            Integer valueOf5 = Integer.valueOf(i2);
                            Integer valueOf6 = Integer.valueOf(agxg.b(agxeVar) ? 1 : 0);
                            Object[] objArr2 = new Object[3];
                            objArr2[i3] = valueOf4;
                            objArr2[1] = valueOf5;
                            objArr2[2] = valueOf6;
                            String format2 = String.format(locale2, "emoji.v2.%s.%d.%d", objArr2);
                            agsw agswVar2 = (agsw) e.a(new agud(context, 2));
                            ListenableFuture g = ancj.g(agswVar2.b(format2, anenVar), new rga(context, intValue, agxeVar, agswVar2, format2, anenVar, 3), anenVar);
                            Trace.endSection();
                            alobVar.h(g);
                            i5 = i2 + 1;
                            i4 = i3;
                            c2 = 1;
                        } finally {
                        }
                    }
                }
                ListenableFuture bE = albo.bE(alobVar.g());
                Trace.endSection();
                this.g.put(agxeVar, bE);
                return bE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return listenableFuture;
    }
}
