package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;

/* renamed from: j$.time.format.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0081a implements j$.time.temporal.n {
    @Override // j$.time.temporal.n
    public final Object g(TemporalAccessor temporalAccessor) {
        ZoneId zoneId = (ZoneId) temporalAccessor.D(j$.time.temporal.j.l());
        if (zoneId == null || (zoneId instanceof ZoneOffset)) {
            return null;
        }
        return zoneId;
    }
}
