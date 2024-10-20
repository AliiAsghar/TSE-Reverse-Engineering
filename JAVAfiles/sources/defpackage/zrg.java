package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageLinkPreviewView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageMetadataView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.Compose2oFragment;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zrg implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ zrg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, arqr] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        ins insVar;
        int i = 0;
        switch (this.b) {
            case 0:
                ((zfh) obj).b(((zri) this.a).n, R.dimen.conversation_compose2o_send_text_size);
                return;
            case 1:
                aabp aabpVar = (aabp) obj;
                xze xzeVar = zri.a;
                if (aabpVar != null) {
                    aabo[] aaboVarArr = aabpVar.f;
                    int length = aaboVarArr.length;
                    while (true) {
                        Object obj2 = this.a;
                        if (i < 2) {
                            aaboVarArr[i].x((Bundle) obj2);
                            i++;
                        } else {
                            aabe aabeVar = aabpVar.c;
                            Bundle bundle = (Bundle) obj2;
                            bundle.putBoolean("is_ime_visible_before_pause", aabeVar.c);
                            bundle.putBoolean("is_c2o_visible_before_pause", aabeVar.d);
                            bundle.putBoolean("is_c2o_hidden_behind_ime", aabeVar.k);
                            bundle.putBoolean("is_emoji_picker_hidden_behind_ime", aabeVar.j);
                            bundle.putBoolean("is_emoji_picker_visible_before_pause", aabeVar.i);
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 2:
                ins insVar2 = ins.C2O;
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("open_location_chooser", true);
                ((inn) obj).s(insVar2, true, false, bundle2);
                ((zri) this.a).D(true);
                return;
            case 3:
                aabp aabpVar2 = (aabp) obj;
                if (aabpVar2 != null) {
                    if (aabpVar2.k.g()) {
                        aabk aabkVar = aabpVar2.h;
                        if (!aabkVar.b) {
                            aabkVar.u(false, true);
                        }
                        Compose2oFragment n = aabkVar.n();
                        if (n != null) {
                            n.E().k(amqe.EXPAND, ((rsr) aabkVar.i.a()).n());
                        } else {
                            xzb.g("Bugle", "Could not find compose2o fragment to show location");
                            aabkVar.h.k(R.string.conversation_suggestion_share_location_action_failure);
                        }
                    } else {
                        xzb.g("Bugle", "Share location action invoked with c20 enabled but no location permission.");
                        aabpVar2.d.k(R.string.enable_location_permissions);
                    }
                    ((zri) this.a).D(aabpVar2.h.l);
                    return;
                }
                return;
            case 4:
                aabp aabpVar3 = (aabp) obj;
                if (aabpVar3 != null) {
                    Object obj3 = this.a;
                    aabpVar3.y(1);
                    ((zri) obj3).S();
                    return;
                }
                return;
            case 5:
                ((lyv) obj).e();
                ((zri) this.a).V();
                return;
            case 6:
                ((zri) this.a).l.a(((inn) obj).c());
                return;
            case 7:
                ((zfh) obj).b(((zri) this.a).o, R.dimen.conversation_compose2o_subject_text_size);
                return;
            case 8:
                aabp aabpVar4 = (aabp) obj;
                if (aabpVar4 == null) {
                    return;
                }
                zri zriVar = (zri) this.a;
                if (((abdc) zriVar.ah.b()).b) {
                    insVar = ins.IME;
                } else {
                    aabk aabkVar2 = aabpVar4.h;
                    if (aabkVar2 != null && aabkVar2.l && aabkVar2.c) {
                        insVar = ins.CAMERA_GALLERY;
                    } else if (aabpVar4.x()) {
                        insVar = ins.EMOTIVE;
                    } else if (aabpVar4.v()) {
                        insVar = ins.C2O;
                    } else {
                        insVar = null;
                    }
                }
                zriVar.l.a(insVar);
                return;
            case 9:
                xze xzeVar2 = zri.a;
                ((inn) obj).k(this.a);
                return;
            case 10:
                ((zfh) obj).b(((zri) this.a).m, R.dimen.conversation_compose2o_send_text_size);
                return;
            case 11:
                zrw zrwVar = (zrw) this.a;
                ((aohs) zrwVar.f.b()).C(new akfk((ansy) zrwVar.i.b(), new ikn((kpd) obj, 16), "ditto_satellite_mode_key", 2), zrwVar.l);
                return;
            case 12:
                ((zrt) this.a).F().getIntent();
                ((kpb) obj).c();
                return;
            case 13:
                alvw d = zxm.a.d();
                d.X(alwp.a, "Bugle");
                ((alvg) ((alvg) d).h("com/google/android/apps/messaging/ui/conversation/conversationscale/ConversationScaleDataServiceImpl", "saveConversationScaleState", 85, "ConversationScaleDataServiceImpl.java")).q("Conversation scale saved");
                ((mbl) ((zxm) this.a).b.b()).c("Bugle.ConversationScale.ConversationScaleSaveFailed.Count");
                return;
            case 14:
                this.a.a(obj);
                return;
            case 15:
                this.a.a(obj);
                return;
            case 16:
                int i2 = ConversationMessageLinkPreviewView.v;
                ((mag) obj).c(((ssi) this.a).k(), true);
                return;
            case 17:
                ((zxq) obj).k(((ConversationMessageMetadataView) this.a).l);
                return;
            case 18:
                ((zxq) obj).b(((ConversationMessageMetadataView) this.a).l);
                return;
            case 19:
                ((zfh) obj).b(((ConversationMessageMetadataView) this.a).g, R.dimen.message_metadata_text_size);
                return;
            default:
                ((zfh) obj).b(((ConversationMessageMetadataView) this.a).f, R.dimen.message_metadata_text_size);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case 6:
                return Consumer$CC.$default$andThen(this, consumer);
            case 7:
                return Consumer$CC.$default$andThen(this, consumer);
            case 8:
                return Consumer$CC.$default$andThen(this, consumer);
            case 9:
                return Consumer$CC.$default$andThen(this, consumer);
            case 10:
                return Consumer$CC.$default$andThen(this, consumer);
            case 11:
                return Consumer$CC.$default$andThen(this, consumer);
            case 12:
                return Consumer$CC.$default$andThen(this, consumer);
            case 13:
                return Consumer$CC.$default$andThen(this, consumer);
            case 14:
                return Consumer$CC.$default$andThen(this, consumer);
            case 15:
                return Consumer$CC.$default$andThen(this, consumer);
            case 16:
                return Consumer$CC.$default$andThen(this, consumer);
            case 17:
                return Consumer$CC.$default$andThen(this, consumer);
            case 18:
                return Consumer$CC.$default$andThen(this, consumer);
            case 19:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }
}
