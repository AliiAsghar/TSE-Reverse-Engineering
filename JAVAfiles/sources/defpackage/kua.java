package defpackage;

import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.ProblematicConversationDataView;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.ProblematicMessageDataView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kua {
    public static final utz a = uuh.e(uuh.b, "max_conversation_count", 5);
    public static final utz b = uuh.e(uuh.b, "max_message_count", 20);
    public LinearLayout c;
    public final armf d;
    public final armf e;
    public LayoutInflater g;
    public final kta i;
    public final akgh j;
    public final List f = new ArrayList();
    public final alwo h = alwo.o("Bugle");

    public kua(armf armfVar, armf armfVar2) {
        ksz kszVar = new ksz();
        kszVar.b(((Integer) a.e()).intValue());
        kszVar.c(((Integer) b.e()).intValue());
        kszVar.d(new lga());
        this.i = kszVar.a();
        this.j = new akgh<alog<ksy>>() { // from class: kua.1
            @Override // defpackage.akgh
            public final void a(Throwable th) {
                ((alwl) ((alwl) ((alwl) kua.this.h.i()).g(th)).h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/ui/MessageSelectorFragmentPeer$1", "onError", 'N', "MessageSelectorFragmentPeer.java")).q("Failed to fetch data from ProblematicConversationDataRequest, skip");
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v1 */
            /* JADX WARN: Type inference failed for: r11v2, types: [int] */
            /* JADX WARN: Type inference failed for: r11v4 */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List, alog] */
            @Override // defpackage.akgh
            public final /* bridge */ /* synthetic */ void c(Object obj) {
                alog alogVar;
                int i;
                alog alogVar2 = (alog) obj;
                int size = alogVar2.size();
                boolean z = false;
                int i2 = 0;
                while (i2 < size) {
                    kua kuaVar = kua.this;
                    ksy ksyVar = (ksy) alogVar2.get(i2);
                    LayoutInflater layoutInflater = kuaVar.g;
                    if (layoutInflater != null) {
                        ProblematicConversationDataView problematicConversationDataView = (ProblematicConversationDataView) layoutInflater.inflate(R.layout.problematic_conversation_data_view, kuaVar.c, z);
                        kuc E = problematicConversationDataView.E();
                        LayoutInflater layoutInflater2 = kuaVar.g;
                        E.f = ksyVar.b;
                        E.b.setText(E.f);
                        E.e = ksyVar.c;
                        ?? r6 = ksyVar.a;
                        int i3 = ((alsx) r6).c;
                        for (?? r11 = z; r11 < i3; r11++) {
                            ksx ksxVar = (ksx) r6.get(r11);
                            ProblematicMessageDataView problematicMessageDataView = (ProblematicMessageDataView) layoutInflater2.inflate(R.layout.problematic_message_data_view, E.a, z);
                            kuf E2 = problematicMessageDataView.E();
                            E2.e = ksxVar;
                            E2.a.setText(ksxVar.a);
                            E2.b.setText(((znj) E2.d.b()).z(ksxVar.b));
                            E2.f = E;
                            E.d.add(problematicMessageDataView.E());
                            E.a.addView(problematicMessageDataView);
                            alogVar2 = alogVar2;
                            size = size;
                            z = false;
                        }
                        alogVar = alogVar2;
                        i = size;
                        E.a();
                        kuaVar.f.add(problematicConversationDataView.E());
                        LinearLayout linearLayout = kuaVar.c;
                        if (linearLayout != null) {
                            linearLayout.addView(problematicConversationDataView);
                        }
                    } else {
                        alogVar = alogVar2;
                        i = size;
                    }
                    i2++;
                    alogVar2 = alogVar;
                    size = i;
                    z = false;
                }
            }

            @Override // defpackage.akgh
            public final /* synthetic */ void b() {
            }
        };
        this.e = armfVar;
        this.d = armfVar2;
    }
}
