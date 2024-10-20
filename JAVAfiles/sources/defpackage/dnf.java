package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnf extends arrp implements arqr<dnd, CharSequence> {
    final /* synthetic */ dnd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnf(dnd dndVar) {
        super(1);
        this.a = dndVar;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        String concat;
        String str;
        dnd dndVar = (dnd) obj;
        if (dndVar instanceof dmw) {
            StringBuilder sb = new StringBuilder("CommitTextCommand(text.length=");
            dmw dmwVar = (dmw) dndVar;
            sb.append(dmwVar.b().length());
            sb.append(", newCursorPosition=");
            sb.append(dmwVar.a);
            sb.append(')');
            concat = sb.toString();
        } else if (dndVar instanceof doh) {
            StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text.length=");
            doh dohVar = (doh) dndVar;
            sb2.append(dohVar.b().length());
            sb2.append(", newCursorPosition=");
            sb2.append(dohVar.a);
            sb2.append(')');
            concat = sb2.toString();
        } else if (dndVar instanceof dog) {
            concat = dndVar.toString();
        } else if (dndVar instanceof dnb) {
            concat = dndVar.toString();
        } else if (dndVar instanceof dnc) {
            concat = dndVar.toString();
        } else if (dndVar instanceof doi) {
            concat = dndVar.toString();
        } else if (dndVar instanceof dnj) {
            concat = dndVar.toString();
        } else if (dndVar instanceof dmv) {
            concat = dndVar.toString();
        } else if (dndVar instanceof dnv) {
            concat = dndVar.toString();
        } else if (dndVar instanceof dna) {
            concat = dndVar.toString();
        } else {
            Class<?> cls = dndVar.getClass();
            int i = arsc.a;
            String c = new arrh(cls).c();
            if (c == null) {
                c = "{anonymous EditCommand}";
            }
            concat = "Unknown EditCommand: ".concat(c);
        }
        if (this.a == dndVar) {
            str = " > ";
        } else {
            str = "   ";
        }
        return str.concat(String.valueOf(concat));
    }
}
