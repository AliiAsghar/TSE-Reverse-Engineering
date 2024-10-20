package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class areb {
    static final aqrq a = new aqrq("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", null);
    final Long b;
    final Boolean c;
    final Integer d;
    final Integer e;
    final argd f;
    final arcc g;

    public areb(Map map, boolean z, int i, int i2) {
        Map map2;
        boolean z2;
        boolean z3;
        String str;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        argd argdVar;
        Map map3;
        boolean z9;
        boolean z10;
        arcc arccVar;
        boolean z11;
        boolean z12;
        this.b = arct.d(map, "timeout");
        this.c = arct.a(map, "waitForReady");
        Integer c = arct.c(map, "maxResponseMessageBytes");
        this.d = c;
        if (c != null) {
            if (c.intValue() >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            albo.N(z12, "maxInboundMessageSize %s exceeds bounds", c);
        }
        Integer c2 = arct.c(map, "maxRequestMessageBytes");
        this.e = c2;
        if (c2 != null) {
            if (c2.intValue() >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            albo.N(z11, "maxOutboundMessageSize %s exceeds bounds", c2);
        }
        if (z) {
            map2 = arct.i(map, "retryPolicy");
        } else {
            map2 = null;
        }
        if (map2 == null) {
            str = "maxAttempts";
            argdVar = null;
        } else {
            Integer c3 = arct.c(map2, "maxAttempts");
            c3.getClass();
            int intValue = c3.intValue();
            if (intValue >= 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            albo.L(z2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i);
            Long d = arct.d(map2, "initialBackoff");
            d.getClass();
            long longValue = d.longValue();
            if (longValue > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            albo.M(z3, "initialBackoffNanos must be greater than 0: %s", longValue);
            Long d2 = arct.d(map2, "maxBackoff");
            d2.getClass();
            str = "maxAttempts";
            long longValue2 = d2.longValue();
            if (longValue2 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            albo.M(z4, "maxBackoff must be greater than 0: %s", longValue2);
            Double b = arct.b(map2, "backoffMultiplier");
            b.getClass();
            double doubleValue = b.doubleValue();
            if (doubleValue > 0.0d) {
                z5 = true;
            } else {
                z5 = false;
            }
            albo.N(z5, "backoffMultiplier must be greater than 0: %s", b);
            Long d3 = arct.d(map2, "perAttemptRecvTimeout");
            if (d3 != null && d3.longValue() < 0) {
                z6 = false;
            } else {
                z6 = true;
            }
            albo.N(z6, "perAttemptRecvTimeout cannot be negative: %s", d3);
            Set a2 = arhi.a(map2, "retryableStatusCodes");
            if (a2 != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            albo.z(z7, "%s is required in retry policy", "retryableStatusCodes");
            albo.z(!a2.contains(Status.Code.OK), "%s must not contain OK", "retryableStatusCodes");
            if (d3 == null && a2.isEmpty()) {
                z8 = false;
            } else {
                z8 = true;
            }
            d.t(z8, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            argdVar = new argd(min, longValue, longValue2, doubleValue, d3, a2);
        }
        this.f = argdVar;
        if (z) {
            map3 = arct.i(map, "hedgingPolicy");
        } else {
            map3 = null;
        }
        if (map3 == null) {
            arccVar = null;
        } else {
            Integer c4 = arct.c(map3, str);
            c4.getClass();
            int intValue2 = c4.intValue();
            if (intValue2 >= 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            albo.L(z9, "maxAttempts must be greater than 1: %s", intValue2);
            int min2 = Math.min(intValue2, i2);
            Long d4 = arct.d(map3, "hedgingDelay");
            d4.getClass();
            long longValue3 = d4.longValue();
            if (longValue3 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            albo.M(z10, "hedgingDelay must not be negative: %s", longValue3);
            Set a3 = arhi.a(map3, "nonFatalStatusCodes");
            if (a3 == null) {
                a3 = DesugarCollections.unmodifiableSet(EnumSet.noneOf(Status.Code.class));
            } else {
                albo.z(true ^ a3.contains(Status.Code.OK), "%s must not contain OK", "nonFatalStatusCodes");
            }
            arccVar = new arcc(min2, longValue3, a3);
        }
        this.g = arccVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof areb)) {
            return false;
        }
        areb arebVar = (areb) obj;
        if (!d.B(this.b, arebVar.b) || !d.B(this.c, arebVar.c) || !d.B(this.d, arebVar.d) || !d.B(this.e, arebVar.e) || !d.B(this.f, arebVar.f) || !d.B(this.g, arebVar.g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("timeoutNanos", this.b);
        aj.b("waitForReady", this.c);
        aj.b("maxInboundMessageSize", this.d);
        aj.b("maxOutboundMessageSize", this.e);
        aj.b("retryPolicy", this.f);
        aj.b("hedgingPolicy", this.g);
        return aj.toString();
    }
}
