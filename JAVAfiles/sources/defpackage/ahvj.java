package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahvj {
    public static final ahvf a(String str, long j, String str2, Set set, boolean z, boolean z2) {
        return new ahvf(str2, str, Long.valueOf(j), new ahuq(z2, set, new ahvh(1), new ahvg(Long.class, 1)));
    }

    public static final ahvf b(String str, String str2, String str3, Set set, boolean z, boolean z2) {
        return new ahvf(str3, str, str2, new ahuq(false, set, (ahvi) new ahvh(2), (ahvi) new ahvg(String.class, 4)));
    }

    public static final ahvf c(String str, boolean z, String str2, Set set, boolean z2, boolean z3) {
        return new ahvf(str2, str, Boolean.valueOf(z), new ahuq(z3, set, new ahvh(0), new ahvg(Boolean.class, 3)));
    }

    public static final ahvf d(String str, ahvi ahviVar, String str2, String str3, Set set, boolean z, boolean z2) {
        return new ahvf(str3, str, new ahuq(z2, set, new ahvg(ahviVar, 0), new ahvg(ahviVar, 2)), str2);
    }
}
