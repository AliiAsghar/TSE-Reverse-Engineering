package j$.time.format;

import j$.time.temporal.TemporalField;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0082b extends C {
    final /* synthetic */ B e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0082b(B b) {
        this.e = b;
    }

    @Override // j$.time.format.C
    public final String e(j$.time.chrono.m mVar, TemporalField temporalField, long j, H h, Locale locale) {
        return this.e.a(j, h);
    }

    @Override // j$.time.format.C
    public final String f(TemporalField temporalField, long j, H h, Locale locale) {
        return this.e.a(j, h);
    }

    @Override // j$.time.format.C
    public final Iterator g(j$.time.chrono.m mVar, TemporalField temporalField, H h, Locale locale) {
        return this.e.b(h);
    }

    @Override // j$.time.format.C
    public final Iterator h(TemporalField temporalField, H h, Locale locale) {
        return this.e.b(h);
    }
}
