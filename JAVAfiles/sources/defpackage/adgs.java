package defpackage;

import android.telephony.ims.SipDelegateConfiguration;
import android.telephony.ims.SipDelegateConnection;
import android.telephony.ims.SipMessage;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgs implements aior {
    public static final advp a = new advp("SipRegistrationSipTransport");
    public SipDelegateConfiguration b;
    public asqc d;
    private final SipDelegateConnection e;
    public final Map c = DesugarCollections.synchronizedMap(new HashMap());
    private final UUID f = UUID.randomUUID();

    public adgs(SipDelegateConnection sipDelegateConnection, SipDelegateConfiguration sipDelegateConfiguration) {
        this.e = sipDelegateConnection;
        this.b = sipDelegateConfiguration;
    }

    @Override // defpackage.aior
    public final int a() {
        return this.b.getLocalAddress().getPort();
    }

    @Override // defpackage.aior
    public final int b() {
        return this.b.getSipServerAddress().getPort();
    }

    @Override // defpackage.aior
    public final String c() {
        return "";
    }

    @Override // defpackage.aior
    public final String d() {
        return this.f.toString();
    }

    @Override // defpackage.aior
    public final String e() {
        String hostAddress = this.b.getLocalAddress().getAddress().getHostAddress();
        hostAddress.getClass();
        return hostAddress;
    }

    @Override // defpackage.aior
    public final String f() {
        String hostAddress = this.b.getSipServerAddress().getAddress().getHostAddress();
        hostAddress.getClass();
        return hostAddress;
    }

    public final void g(ainh ainhVar, boolean z) {
        if (ainhVar != null) {
            SipDelegateConnection sipDelegateConnection = this.e;
            if (z || ainhVar.t()) {
                String h = ainhVar.h();
                if ("BYE".equals(ainhVar.i()) && h != null) {
                    sipDelegateConnection.cleanupSession(h);
                }
            }
        }
    }

    @Override // defpackage.aior
    public final void i(ainh ainhVar) {
        long version = this.b.getVersion();
        ainb f = ainhVar.f();
        f.getClass();
        String b = f.b();
        b.getClass();
        int intValue = ((Integer) Optional.ofNullable(Integer.valueOf(this.b.getMaxUdpPayloadSizeBytes())).filter(new addf(5)).orElse(1300)).intValue();
        SipMessage n = adcx.n(ainhVar);
        if (n.getStartLine().length() + n.getHeaderSection().length() + n.getContent().length > intValue) {
            ainb f2 = ainhVar.f();
            f2.getClass();
            f2.p(ailh.TCP.d);
            n = adcx.n(ainhVar);
        }
        this.c.put(b, ainhVar);
        this.e.sendMessage(n, version);
    }

    @Override // defpackage.aior
    public final void j(aios aiosVar) {
        throw new UnsupportedOperationException("Cannot set unused SipTransportErrorListener for Single-Reg SipTransport");
    }

    @Override // defpackage.aior
    public final void k() {
        try {
            asqc asqcVar = this.d;
            if (asqcVar != null) {
                asqcVar.w();
            }
        } catch (IllegalMonitorStateException | UnsupportedOperationException e) {
            advr.j(e, a, "Caught exception in SingleRegistrationSipTransport#terminate", new Object[0]);
        }
    }

    @Override // defpackage.aior
    public final boolean m() {
        return false;
    }

    @Override // defpackage.aior
    public final boolean n() {
        return false;
    }

    @Override // defpackage.aior
    public final void o(asqc asqcVar) {
        this.d = asqcVar;
    }

    @Override // defpackage.aior
    public final void h() {
    }

    @Override // defpackage.aior
    public final void l(int i) {
    }
}
