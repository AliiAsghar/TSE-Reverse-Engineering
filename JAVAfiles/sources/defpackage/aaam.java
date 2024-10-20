package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaam implements ajmg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aaam(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ajmf
    public final void a(ajmk ajmkVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1 && ajmkVar != null) {
                ((afof) this.a).aO(ajmkVar.d);
                return;
            }
            return;
        }
        alvw g = aaar.ah.g();
        g.X(alwp.a, "emojiGallery");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/ui/conversation/emoji/EmojiGalleryFragment$1", "onTabReselected", 83, "EmojiGalleryFragment.java")).t("onTabReselected(%s)", ajmkVar.a());
        ((aaar) this.a).q(ajmkVar.d);
    }

    @Override // defpackage.ajmf
    public final void b(ajmk ajmkVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                afof afofVar = (afof) this.a;
                int i2 = afofVar.ak;
                int i3 = ajmkVar.d;
                if (i2 != i3) {
                    afofVar.ak = i3;
                    afofVar.aO(i3);
                    return;
                }
                return;
            }
            int i4 = ajmkVar.d;
            if (i4 != 0) {
                if (i4 == 1) {
                    ((izh) this.a).d = new izl();
                    izh izhVar = (izh) this.a;
                    izl izlVar = izhVar.d;
                    izlVar.e = izhVar;
                    izhVar.e(izlVar);
                    return;
                }
                throw new AssertionError(a.bV(i4, "Info & Options tab attempted to select invalid tab position"));
            }
            ((izh) this.a).c = new izk();
            izh izhVar2 = (izh) this.a;
            izk izkVar = izhVar2.c;
            izkVar.e = izhVar2;
            izhVar2.e(izkVar);
            return;
        }
        alvw g = aaar.ah.g();
        g.X(alwp.a, "emojiGallery");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/ui/conversation/emoji/EmojiGalleryFragment$1", "onTabSelected", 91, "EmojiGalleryFragment.java")).t("onTabSelected(%s)", ajmkVar.a());
        Object obj = this.a;
        int i5 = ajmkVar.d;
        aaar aaarVar = (aaar) obj;
        if (i5 != aaarVar.am) {
            aaarVar.am = i5;
            aaarVar.q(i5);
        }
    }

    @Override // defpackage.ajmf
    public final void c(ajmk ajmkVar) {
        if (this.b != 0) {
            return;
        }
        alvw g = aaar.ah.g();
        g.X(alwp.a, "emojiGallery");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/ui/conversation/emoji/EmojiGalleryFragment$1", "onTabUnselected", 102, "EmojiGalleryFragment.java")).t("onTabUnselected(%s)", ajmkVar.a());
    }
}
