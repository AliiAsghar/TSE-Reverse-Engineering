package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.stream.Collectors;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vlu {
    public static final alwo a = alwo.o("BugleNotifications");
    public final Context b;
    public final anen c;
    public final anen d;
    public final vmu e;
    public final vmv f;
    public final vmq g;
    public final boolean h;
    public final vjs i;
    public final yyt j;

    public vlu(Context context, anen anenVar, anen anenVar2, vmu vmuVar, vjs vjsVar, yyt yytVar, vmv vmvVar, vmq vmqVar, boolean z) {
        this.b = context;
        this.c = anenVar;
        this.d = anenVar2;
        this.e = vmuVar;
        this.i = vjsVar;
        this.j = yytVar;
        this.f = vmvVar;
        this.g = vmqVar;
        this.h = z;
    }

    public static String a(vmq vmqVar) {
        if (vmqVar == null) {
            return "";
        }
        return b(DesugarCollections.unmodifiableMap(vmqVar.c));
    }

    public static String b(Map map) {
        if (map.isEmpty()) {
            return "";
        }
        return TextUtils.join(",", (Iterable) Collection.EL.stream(map.entrySet()).map(new vil(13)).collect(Collectors.toCollection(new uzg(14))));
    }

    public static Map c(alor alorVar, alor alorVar2) {
        HashMap hashMap = new HashMap(alorVar);
        aluq listIterator = alorVar2.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            String str = (String) entry.getKey();
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, (vmn) entry.getValue());
            } else {
                long j = ((vmn) entry.getValue()).c;
                vmn vmnVar = (vmn) hashMap.get(str);
                vmnVar.getClass();
                long j2 = vmnVar.c;
                vmn vmnVar2 = (vmn) hashMap.get(str);
                vmnVar2.getClass();
                aozy builder = vmnVar2.toBuilder();
                long min = Math.min(j2, j);
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                vmn vmnVar3 = (vmn) builder.b;
                vmnVar3.b |= 1;
                vmnVar3.c = min;
                hashMap.put(str, (vmn) builder.s());
            }
        }
        return hashMap;
    }
}
