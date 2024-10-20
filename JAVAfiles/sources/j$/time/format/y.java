package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC0071b;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;

/* loaded from: classes5.dex */
final class y implements TemporalAccessor {
    final /* synthetic */ InterfaceC0071b a;
    final /* synthetic */ TemporalAccessor b;
    final /* synthetic */ j$.time.chrono.m c;
    final /* synthetic */ ZoneId d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(InterfaceC0071b interfaceC0071b, TemporalAccessor temporalAccessor, j$.time.chrono.m mVar, ZoneId zoneId) {
        this.a = interfaceC0071b;
        this.b = temporalAccessor;
        this.c = mVar;
        this.d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.j.e()) {
            return this.c;
        }
        if (nVar == j$.time.temporal.j.l()) {
            return this.d;
        }
        if (nVar == j$.time.temporal.j.j()) {
            return this.b.D(nVar);
        }
        return nVar.g(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        InterfaceC0071b interfaceC0071b = this.a;
        if (interfaceC0071b != null && temporalField.a0()) {
            return interfaceC0071b.f(temporalField);
        }
        return this.b.f(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int get(TemporalField temporalField) {
        return j$.time.temporal.j.a(this, temporalField);
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.b);
        String str2 = "";
        j$.time.chrono.m mVar = this.c;
        if (mVar == null) {
            str = "";
        } else {
            str = " with chronology ".concat(String.valueOf(mVar));
        }
        ZoneId zoneId = this.d;
        if (zoneId != null) {
            str2 = " with zone ".concat(String.valueOf(zoneId));
        }
        return valueOf + str + str2;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p u(TemporalField temporalField) {
        InterfaceC0071b interfaceC0071b = this.a;
        if (interfaceC0071b != null && temporalField.a0()) {
            return interfaceC0071b.u(temporalField);
        }
        return this.b.u(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        InterfaceC0071b interfaceC0071b = this.a;
        if (interfaceC0071b != null && temporalField.a0()) {
            return interfaceC0071b.y(temporalField);
        }
        return this.b.y(temporalField);
    }
}
