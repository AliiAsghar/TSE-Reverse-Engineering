package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.HashMap;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nfz implements Supplier {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    public /* synthetic */ nfz(int i) {
        this.b = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.b) {
            case 0:
                alwo alwoVar = nga.a;
                return null;
            case 1:
                ((alwl) ((alwl) nfq.a.i()).h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/DefaultSelfIdentity", "getRcsConfig", 277, "DefaultSelfIdentity.java")).q("messaging identity is not available, returning default config.");
                return nge.a;
            case 2:
                alvi alviVar = ngk.a;
                return null;
            case 3:
                return a.by();
            case 4:
                return a.bz();
            case 5:
                return a.by();
            case 6:
                return a.by();
            case 7:
                alvi alviVar2 = ngr.c;
                return Boolean.valueOf(xyp.c());
            case 8:
                return (Boolean) ngr.d.e();
            case 9:
                throw new IllegalArgumentException("Conversation not found");
            case 10:
                throw null;
            case 11:
                throw null;
            case 12:
                throw null;
            case 13:
                return new HashMap();
            case 14:
                Duration duration = puw.a;
                return Instant.EPOCH;
            case 15:
                Duration duration2 = puw.a;
                return Instant.EPOCH;
            case 16:
                return Instant.EPOCH;
            case 17:
                return Instant.EPOCH;
            case 18:
                return Instant.EPOCH;
            case 19:
                return new pxs(String.format("No \"%s\" header found in response", "WWW-Authenticate"));
            default:
                return new IllegalStateException("Required response info is missing");
        }
    }
}
