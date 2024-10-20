package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xpd extends agps {
    public xpd() {
        super("file_transfer");
    }

    @Override // defpackage.agps
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final agpr a() {
        ac();
        String str = this.c;
        agpt agptVar = this.e;
        return new agpr(str, this.a, this.b, this.d.g(), agptVar.a());
    }

    public final void c(qeq qeqVar) {
        if (qeqVar == null) {
            this.a.putNull("attachment_upload_response");
        } else {
            this.a.put("attachment_upload_response", qeqVar.toByteArray());
        }
    }

    public final void d(qep qepVar) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 59910) {
            agnc.t("thumbnail_information", intValue2);
        }
        if (intValue >= 59910) {
            if (qepVar == null) {
                this.a.putNull("thumbnail_information");
            } else {
                this.a.put("thumbnail_information", qepVar.toByteArray());
            }
        }
    }

    public final void e(String str) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 55030) {
            agnc.t("transfer_handle", intValue2);
        }
        if (intValue >= 55030) {
            agnc.r(this.a, "transfer_handle", str);
        }
    }

    public final void f(Function function) {
        Object apply;
        apply = function.apply(new xpe());
        Z(new agpw((xpe) apply));
    }
}
