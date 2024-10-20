package defpackage;

import j$.time.Instant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anbz implements anca {
    public static final anbz a;
    private static final /* synthetic */ anbz[] b;

    static {
        anbz anbzVar = new anbz();
        a = anbzVar;
        b = new anbz[]{anbzVar};
    }

    private anbz() {
    }

    public static anbz[] values() {
        return (anbz[]) b.clone();
    }

    @Override // defpackage.anca
    public final Instant a() {
        return Instant.now();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "TimeSource.system()";
    }
}
