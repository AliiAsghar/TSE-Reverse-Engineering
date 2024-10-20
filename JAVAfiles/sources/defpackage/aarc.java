package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.emoji.EmojiContentItemView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aarc extends aapz {
    private static final amqj f;
    private final aarb g;
    private final mci h;
    private final aaak i;
    private final allp j;
    private final aabd k;

    static {
        aozy createBuilder = amqj.a.createBuilder();
        amqh amqhVar = amqh.EMOJI;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amqj amqjVar = (amqj) apagVar;
        amqjVar.c = amqhVar.v;
        amqjVar.b |= 1;
        amqi amqiVar = amqi.COLLAPSED;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amqj amqjVar2 = (amqj) createBuilder.b;
        amqjVar2.d = amqiVar.e;
        amqjVar2.b |= 2;
        f = (amqj) createBuilder.s();
    }

    public aarc(mci mciVar, aabd aabdVar, aaak aaakVar, aarb aarbVar, aaqa aaqaVar, ContentGridView contentGridView, int i) {
        super(aarbVar, aaqaVar, contentGridView, i);
        this.j = new alnm();
        this.g = aarbVar;
        this.h = mciVar;
        this.k = aabdVar;
        this.i = aaakVar;
    }

    @Override // defpackage.aapz
    public final void d(aaqi aaqiVar, int i) {
        super.d(aaqiVar, i);
        EmojiContentItemView emojiContentItemView = (EmojiContentItemView) aaqiVar;
        String str = ((aarg) this.g.b.get(i)).a;
        if (!this.j.a().containsKey(str)) {
            this.j.put(this.i.a(this.k.b(str)), str);
        }
        aarg aargVar = new aarg((String) this.j.a().get(str));
        emojiContentItemView.b = aargVar;
        emojiContentItemView.a.setText(aargVar.a);
    }

    @Override // defpackage.aapz
    protected final void f(aaqi aaqiVar, int i) {
        aarg aargVar = ((EmojiContentItemView) aaqiVar).b;
        String str = aargVar.a;
        if (!this.j.containsKey(str)) {
            xzb.o("Bugle", "Attempted to mark emoji %1$s as recent, but emoji is not displayed currently.", str);
        } else {
            this.g.d.g((String) this.j.get(str));
        }
        if (((Boolean) utw.o.e()).booleanValue()) {
            this.a.j(new imw(aargVar.a), new aauj(f), i);
        } else {
            this.a.k(aargVar);
            this.h.e(f, i);
        }
    }
}
