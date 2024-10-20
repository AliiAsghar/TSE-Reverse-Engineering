package defpackage;

import android.util.Base64;
import android.view.View;
import com.google.android.apps.messaging.ui.conversation.suggestions.ConversationSuggestionsView;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.security.KeyPair;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aabj implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ aabj(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        switch (this.a) {
            case 0:
                ((aaqd) obj).p();
                return;
            case 1:
                ((aaqd) obj).g();
                return;
            case 2:
                return;
            case 3:
                return;
            case 4:
                return;
            case 5:
                ((View) obj).setPadding(0, 0, 0, 0);
                return;
            case 6:
                ((luf) obj).b();
                return;
            case 7:
                ((ldt) obj).a();
                return;
            case 8:
                ((ldt) obj).a();
                return;
            case 9:
                ((ldt) obj).a();
                return;
            case 10:
                uuf uufVar = ConversationSuggestionsView.a;
                ((woj) obj).h();
                return;
            case 11:
                uuf uufVar2 = ConversationSuggestionsView.a;
                ((woj) obj).i();
                return;
            case 12:
                uuf uufVar3 = ConversationSuggestionsView.a;
                ((woj) obj).h();
                return;
            case 13:
                int i = aaig.d;
                ((lan) obj).b();
                return;
            case 14:
                int i2 = aaig.d;
                Collection.EL.stream(((lao) obj).a()).forEach(new aabj(13));
                return;
            case 15:
                xze xzeVar = aalt.c;
                ((aalu) obj).a();
                return;
            case 16:
                xze xzeVar2 = aalt.c;
                ((aaor) obj).a();
                return;
            case 17:
                xze xzeVar3 = aalt.c;
                ((aanm) obj).a();
                return;
            case 18:
                int i3 = aalz.y;
                ((xbz) obj).i();
                return;
            case 19:
                xyo d = aanj.a.d();
                d.L("public key", Base64.encodeToString(((KeyPair) obj).getPublic().getEncoded(), 0));
                d.q();
                return;
            default:
                aasm.f.n("Failed to create media file for capture", (Throwable) obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
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
