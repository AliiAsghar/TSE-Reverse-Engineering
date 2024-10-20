package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ptw extends agps {
    public ptw() {
        super("rcs_remote_capabilities_cache");
    }

    @Override // defpackage.agps
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final agpr a() {
        ac();
        String str = this.c;
        agpt agptVar = this.e;
        return new agpr(str, this.a, this.b, this.d.g(), agptVar.a());
    }

    public final void c(Instant instant) {
        if (instant == null) {
            this.a.putNull("last_refresh_timestamp");
        } else {
            this.a.put("last_refresh_timestamp", Long.valueOf(uzz.k(instant)));
        }
    }

    public final void d(String str) {
        agnc.r(this.a, "msisdn", str);
    }

    public final void e(ptz ptzVar) {
        if (ptzVar == null) {
            this.a.putNull("rcs_capabilities");
        } else {
            this.a.put("rcs_capabilities", ptzVar.toByteArray());
        }
    }
}
