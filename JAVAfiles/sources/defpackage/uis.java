package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uis {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/resizing/v2/UpdateMessagePartAfterResizingHelper");
    public final Context b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    private final armf h;
    private final armf i;

    public uis(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        this.b = context;
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.h = armfVar4;
        this.f = armfVar5;
        this.g = armfVar6;
        this.i = armfVar7;
    }

    public final void a(final MessagePartCoreData messagePartCoreData, final String str, final String str2, final tql tqlVar, Action action) {
        boolean z = true;
        if (tqlVar != tql.SUCCEEDED && tqlVar != tql.FAILED && tqlVar != tql.TOO_LARGE) {
            z = false;
        }
        albo.T(z);
        final Uri t = messagePartCoreData.t();
        t.getClass();
        if (((pkj) this.i.b()).a() && (str2.equals("video/mpeg") || str2.equals("video/mpeg4"))) {
            a(messagePartCoreData, str, "video/mp4", tqlVar, action);
            return;
        }
        final long b = ((ydk) this.h.b()).b(t);
        if (((Integer) ((agnq) this.e.b()).c("UpdateMessagePartAfterResizingHelper#executeInTransaction", new alhr() { // from class: uir
            @Override // defpackage.alhr
            public final Object get() {
                int i;
                Uri parse = Uri.parse(str);
                tbt tbtVar = new tbt();
                tbtVar.aj("UpdateMessagePartAfterResizingHelper#executeInTransaction");
                tql tqlVar2 = tqlVar;
                tbtVar.q(tqlVar2);
                tbtVar.p();
                uis uisVar = uis.this;
                Uri uri = t;
                MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                String str3 = str2;
                int i2 = 1;
                if (tqlVar2 == tql.SUCCEEDED) {
                    tbtVar.s(parse);
                    tbtVar.e(str3);
                } else {
                    long j = b;
                    if (j > 0 && j <= messagePartCoreData2.p()) {
                        if (((oje) uisVar.g.b()).a()) {
                            ygb ygbVar = (ygb) uisVar.f.b();
                            aozy createBuilder = amnl.a.createBuilder();
                            int i3 = (int) j;
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            amnl amnlVar = (amnl) createBuilder.b;
                            amnlVar.b |= 32;
                            amnlVar.h = i3;
                            if (gh.z(str3)) {
                                i = 5;
                            } else if (gh.i(str3)) {
                                i = 4;
                            } else if (gh.n(str3, false)) {
                                i = 3;
                            } else {
                                i = 2;
                            }
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            amnl amnlVar2 = (amnl) createBuilder.b;
                            amnlVar2.p = a.ak(i);
                            amnlVar2.b |= 8192;
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            amnl amnlVar3 = (amnl) createBuilder.b;
                            amnlVar3.c = a.ak(5);
                            amnlVar3.b |= 1;
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            amnl amnlVar4 = (amnl) createBuilder.b;
                            amnlVar4.r = akec.aC(19);
                            amnlVar4.b |= 32768;
                            ygbVar.n(new uea(createBuilder, 3));
                        }
                        tbtVar.q(tql.SUCCEEDED);
                        tbtVar.s(uri);
                    }
                }
                tbtVar.v(new uje(messagePartCoreData2.Z(), i2));
                if (tbtVar.a().e() > 0) {
                    if (tqlVar2 == tql.SUCCEEDED) {
                        ((agnq) uisVar.e.b()).h(new rxa(9), null, new ryv(uisVar, uri, 14, null));
                    }
                } else {
                    alvw g = uis.a.g();
                    g.X(alwp.a, "BugleResizing");
                    ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/UpdateMessagePartAfterResizingHelper", "updateInScope", 162, "UpdateMessagePartAfterResizingHelper.java")).t("Attachment for %s gone. Deleting output.", uri);
                    ((agnq) uisVar.e.b()).h(new rxa(8), null, new ryv(uisVar, parse, 13, null));
                }
                return Integer.valueOf(((rww) uisVar.d.b()).a());
            }
        })).intValue() > 0) {
            rbk.d(6, action);
        }
    }
}
