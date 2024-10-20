package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajsc implements ajsi {
    private final ajsj a;

    public ajsc(ajsj ajsjVar) {
        this.a = ajsjVar;
    }

    @Override // defpackage.ajsi
    public final ajqz a(ajrt ajrtVar) {
        return this.a.a(ajrtVar.b).a(ajrtVar);
    }

    @Override // defpackage.ajsi
    public final ajrt b(ajqz ajqzVar) {
        ajsb ajsbVar = new ajsb(this.a);
        ajqzVar.gU(ajsbVar);
        boolean z = true;
        if (!ajsbVar.a() && !ajsbVar.b.isPresent()) {
            z = false;
        }
        albo.T(z);
        if (ajsbVar.a()) {
            return (ajrt) ajsbVar.a.get();
        }
        throw new ajsh("Error serializing message.", (Throwable) ajsbVar.b.get());
    }
}
