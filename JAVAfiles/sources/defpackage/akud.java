package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class akud implements akua {
    @Override // defpackage.akua
    public final akub a(akue akueVar) {
        akub<?> akubVar;
        synchronized (akueVar) {
            akubVar = akueVar.currentMetadata;
        }
        return akubVar;
    }

    @Override // defpackage.akua
    public final boolean b(akue akueVar, akub akubVar, akub akubVar2) {
        synchronized (akueVar) {
            if (akueVar.currentMetadata == akubVar) {
                akueVar.currentMetadata = akubVar2;
                return true;
            }
            return false;
        }
    }
}
