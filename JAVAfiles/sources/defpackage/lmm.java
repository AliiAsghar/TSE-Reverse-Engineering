package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.multishare.MultiShareActivity;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import java.io.File;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmm implements lju {
    private final Context a;
    private final ajwt b;
    private final znp c;
    private final ghw d;

    public lmm(Context context, ajwt ajwtVar, ghw ghwVar, znp znpVar) {
        ajwtVar.getClass();
        this.a = context;
        this.b = ajwtVar;
        this.d = ghwVar;
        this.c = znpVar;
    }

    private final Uri b(Uri uri) {
        if (d.F(uri.getScheme(), "file")) {
            ((alvg) lmn.a.g().h("com/google/android/apps/messaging/navigation/targets/ForwardMessage$ForwardMessageNavigationHandler", "convertFileToContentUri", 150, "ForwardMessage.kt")).t("Converting forwarding file URI to a content URI: %s", yyb.bf(uri));
            String path = uri.getPath();
            if (path == null) {
                ((alvg) lmn.a.h().h("com/google/android/apps/messaging/navigation/targets/ForwardMessage$ForwardMessageNavigationHandler", "convertFileToContentUri", 153, "ForwardMessage.kt")).q("Forwarded URI has no path, aborting content URI conversion");
                return uri;
            }
            Uri a = FileProvider.a(this.a, (String) this.c.b, new File(path));
            a.getClass();
            return a;
        }
        return uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [armf, java.lang.Object] */
    @Override // defpackage.lju
    public final /* synthetic */ Object a(lkf lkfVar, arpe arpeVar) {
        IncomingDraft incomingDraft;
        IncomingDraft incomingDraft2;
        String b;
        String str;
        String str2;
        lmn lmnVar = (lmn) lkfVar;
        Activity al = aabr.al(this.a);
        if (al != null) {
            ghw ghwVar = this.d;
            ajwt ajwtVar = this.b;
            mym mymVar = lmnVar.b;
            Object obj = null;
            if (mymVar instanceof mxs) {
                mxs mxsVar = (mxs) mymVar;
                String str3 = mxsVar.b;
                if (str3 != null && str3.length() != 0) {
                    str2 = str3;
                } else {
                    str2 = null;
                }
                alog alogVar = mxsVar.a;
                alogVar.getClass();
                ArrayList arrayList = new ArrayList(aqjn.J(alogVar, 10));
                alur it = alogVar.iterator();
                while (it.hasNext()) {
                    mxf mxfVar = (mxf) it.next();
                    String j = mxfVar.j();
                    j.getClass();
                    Uri d = mxfVar.d();
                    d.getClass();
                    arrayList.add(new IncomingDraft.Attachment(j, d, null));
                }
                incomingDraft = new IncomingDraft(str2, arrayList, null, false, null, null, true, 60, null);
            } else if (mymVar instanceof mys) {
                mys mysVar = (mys) mymVar;
                String b2 = mysVar.b();
                if (b2 != null && b2.length() != 0) {
                    str = b2;
                } else {
                    str = null;
                }
                incomingDraft = new IncomingDraft(str, null, mysVar.c(), mysVar.d(), null, null, false, 114, null);
            } else if (mymVar instanceof myr) {
                if (((Boolean) ((utz) yig.W.get()).e()).booleanValue()) {
                    myr myrVar = (myr) mymVar;
                    alog a = myrVar.a();
                    a.getClass();
                    alur it2 = a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (((qdq) next).e() == myq.ORIGINAL_TEXT) {
                            obj = next;
                            break;
                        }
                    }
                    qdq qdqVar = (qdq) obj;
                    if (qdqVar == null || (b = qdqVar.f()) == null) {
                        b = myrVar.b();
                    }
                    incomingDraft = new IncomingDraft(b, null, null, false, null, null, false, 126, null);
                } else {
                    incomingDraft2 = new IncomingDraft(((myr) mymVar).b(), null, null, false, null, null, false, 126, null);
                    incomingDraft = incomingDraft2;
                }
            } else {
                if (mymVar instanceof myp) {
                    incomingDraft2 = new IncomingDraft(((myp) mymVar).n(), null, null, false, null, null, false, 126, null);
                } else if (mymVar instanceof myt) {
                    myt mytVar = (myt) mymVar;
                    String i = mytVar.i();
                    String j2 = mymVar.j();
                    j2.getClass();
                    Uri d2 = mytVar.d();
                    d2.getClass();
                    incomingDraft2 = new IncomingDraft(i, aqjn.y(new IncomingDraft.Attachment(j2, b(d2), null)), null, false, null, null, true, 60, null);
                } else if (mymVar instanceof mxf) {
                    String j3 = mymVar.j();
                    j3.getClass();
                    Uri d3 = ((mxf) mymVar).d();
                    d3.getClass();
                    incomingDraft2 = new IncomingDraft(null, aqjn.y(new IncomingDraft.Attachment(j3, b(d3), null)), null, false, null, null, true, 61, null);
                } else {
                    incomingDraft = new IncomingDraft(null, null, null, false, null, null, true, 63, null);
                }
                incomingDraft = incomingDraft2;
            }
            amwf amwfVar = amwf.FORWARD;
            amwfVar.getClass();
            ((ahqr) ghwVar.a.b()).e(ljo.b);
            Intent intent = new Intent(al, (Class<?>) MultiShareActivity.class);
            intent.putExtra("incoming_draft", incomingDraft).getClass();
            intent.putExtra("intent_source", amwfVar.e);
            intent.addFlags(1);
            intent.addFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
            if (kpt.a()) {
                ajya.c(intent, ajwtVar);
            }
            akto.n(al, intent);
            return arnb.a;
        }
        throw new IllegalArgumentException("multi-share must be created with an activity context.");
    }
}
