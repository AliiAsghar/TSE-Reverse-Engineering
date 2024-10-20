package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akep extends RuntimeException {
    public akep(String str) {
        super("A state change that was assumed to be impossible has occurred in a read flow. Please report any occurrence of this exception with the complete stack trace and any test that reproduces the condition at go/tiktok-bug. Constraint broken: ".concat(str));
    }
}
