package defpackage;

import j$.util.DesugarCollections;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajcc implements Callable {
    public static final /* synthetic */ int a = 0;
    private static final alwo b = alwo.o("TachyonSortCountryCodes");

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        int i;
        Set<String> unmodifiableSet = DesugarCollections.unmodifiableSet(ahwa.a().j);
        ArrayList arrayList = new ArrayList(unmodifiableSet.size());
        for (String str : unmodifiableSet) {
            try {
                ahwa a2 = ahwa.a();
                if (!a2.f(str)) {
                    Logger logger = ahwa.a;
                    Level level = Level.WARNING;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid or missing region code (");
                    String str2 = "null";
                    if (str != null) {
                        str2 = str;
                    }
                    sb.append(str2);
                    sb.append(") provided.");
                    logger.log(level, sb.toString());
                    i = 0;
                } else {
                    ahwc b2 = a2.b(str);
                    if (b2 != null) {
                        i = b2.m;
                    } else {
                        throw new IllegalArgumentException("Invalid region code: ".concat(String.valueOf(str)));
                        break;
                    }
                }
                Locale locale = new Locale("", str);
                aozy createBuilder = ajcb.a.createBuilder();
                String displayCountry = locale.getDisplayCountry();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                displayCountry.getClass();
                ((ajcb) apagVar).b = displayCountry;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar2 = createBuilder.b;
                str.getClass();
                ((ajcb) apagVar2).c = str;
                if (!apagVar2.isMutable()) {
                    createBuilder.u();
                }
                ((ajcb) createBuilder.b).d = i;
                arrayList.add((ajcb) createBuilder.s());
            } catch (Exception e) {
                ((alwl) ((alwl) ((alwl) b.i()).g(e)).h("com/google/android/libraries/tachyon/countrycode/GetSortedCountryCodes", "call", 31, "GetSortedCountryCodes.java")).t("Unable to retrieve country code for %s", str);
            }
        }
        Collections.sort(arrayList, new kdw(Collator.getInstance(), 11));
        return arrayList;
    }
}
