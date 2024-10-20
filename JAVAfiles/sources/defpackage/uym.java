package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.util.Pair;
import android.view.TouchDelegate;
import android.view.View;
import com.google.android.apps.messaging.shared.datamodel.action.FixupMessageStatusOnStartupAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uym implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public uym(View view, int i, int i2, View view2, int i3) {
        this.e = i3;
        this.c = view;
        this.b = i;
        this.a = i2;
        this.d = view2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [armf, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                Object obj = this.c;
                                apvt apvtVar = ((apvs) obj).b;
                                if (apvtVar != null) {
                                    int i2 = this.b;
                                    int i3 = this.a;
                                    Object obj2 = this.d;
                                    apvtVar.c = i3;
                                    apvtVar.d = i2;
                                    apvtVar.e = new gul(obj2, obj, 5, (char[]) null);
                                    return;
                                }
                                return;
                            }
                            Object obj3 = ((aqrk) this.c).b;
                            aoxj aoxjVar = (aoxj) obj3;
                            aoxjVar.e((SurfaceTexture) this.d, this.a, this.b);
                            return;
                        }
                        Rect rect = new Rect();
                        View view = (View) this.d;
                        view.getHitRect(rect);
                        rect.top -= 2131168025;
                        rect.left = rect.left;
                        rect.right += this.a;
                        rect.bottom += this.b;
                        ((View) this.c).setTouchDelegate(new TouchDelegate(rect, view));
                        return;
                    }
                    Rect rect2 = new Rect();
                    ((View) this.c).getHitRect(rect2);
                    rect2.top -= this.b;
                    rect2.left = rect2.left;
                    rect2.right += this.a;
                    rect2.bottom = rect2.bottom;
                    ((View) this.d).setTouchDelegate(new TouchDelegate(rect2, (View) this.c));
                    return;
                }
                ((ygs) this.c).b();
                if (!((dtq) this.d).b(new ygh(2, Optional.of(new ygg(this.a, this.b))))) {
                    ((alwl) ygs.a.m().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "getErrorListener", 242, "PlaybackSession.java")).q("Media player encountered error before being released");
                    return;
                }
                return;
            }
            int i4 = 0;
            while (true) {
                ?? r1 = this.c;
                if (i4 < ((alsx) r1).c) {
                    uhl.j((Context) ((FixupMessageStatusOnStartupAction) this.d).c.b, (Uri) ((Pair) r1.get(i4)).first);
                    i4++;
                } else {
                    int i5 = this.b;
                    int i6 = this.a;
                    int i7 = 20;
                    Collection collection = (Collection) Collection.EL.stream(r1).map(new ugo(i7)).collect(Collectors.toCollection(new tyr(8)));
                    tbt tbtVar = new tbt();
                    tbtVar.aj("deleteOutputUriForAllProcessingPartsAndMarkAsNull");
                    tbtVar.q(tql.FAILED);
                    tbtVar.p();
                    tbtVar.v(new tyl(collection, i7));
                    int e = tbtVar.a().e();
                    xyo c = FixupMessageStatusOnStartupAction.a.c();
                    c.x("sendFailedCnt", i6);
                    c.x("downloadFailedCnt", i5);
                    c.x("partsProcessingFailedCnt", e);
                    c.q();
                    return;
                }
            }
        } else {
            aozy createBuilder = amvz.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            int i8 = this.a;
            apag apagVar = createBuilder.b;
            amvz amvzVar = (amvz) apagVar;
            amvzVar.c = i8 - 1;
            amvzVar.b |= 1;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            int i9 = this.b;
            amvz amvzVar2 = (amvz) createBuilder.b;
            Object obj4 = this.d;
            Object obj5 = this.c;
            amvzVar2.d = i9 - 1;
            amvzVar2.b = 2 | amvzVar2.b;
            ConversationIdType conversationIdType = (ConversationIdType) obj4;
            if (!conversationIdType.b()) {
                long a = ((lzz) ((wpp) obj5).c.b()).a(conversationIdType);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amvz amvzVar3 = (amvz) createBuilder.b;
                amvzVar3.b = 4 | amvzVar3.b;
                amvzVar3.e = a;
            }
            maq maqVar = (maq) ((wpp) obj5).b.b();
            amfq amfqVar = (amfq) amfr.a.createBuilder();
            amfp amfpVar = amfp.LIGHTER_EVENT;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar = (amfr) amfqVar.b;
            amfrVar.i = amfpVar.dg;
            amfrVar.b = 1 | amfrVar.b;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar2 = (amfr) amfqVar.b;
            amvz amvzVar4 = (amvz) createBuilder.s();
            amvzVar4.getClass();
            amfrVar2.aW = amvzVar4;
            amfrVar2.f |= 16384;
            maqVar.j(amfqVar);
        }
    }

    public /* synthetic */ uym(View view, int i, int i2, View view2, int i3, byte[] bArr) {
        this.e = i3;
        this.d = view;
        this.a = i;
        this.b = i2;
        this.c = view2;
    }

    public /* synthetic */ uym(FixupMessageStatusOnStartupAction fixupMessageStatusOnStartupAction, alog alogVar, int i, int i2, int i3) {
        this.e = i3;
        this.d = fixupMessageStatusOnStartupAction;
        this.c = alogVar;
        this.a = i;
        this.b = i2;
    }

    public /* synthetic */ uym(Object obj, Object obj2, int i, int i2, int i3) {
        this.e = i3;
        this.c = obj;
        this.d = obj2;
        this.a = i;
        this.b = i2;
    }

    public /* synthetic */ uym(wpp wppVar, int i, int i2, ConversationIdType conversationIdType, int i3) {
        this.e = i3;
        this.c = wppVar;
        this.a = i;
        this.b = i2;
        this.d = conversationIdType;
    }
}
