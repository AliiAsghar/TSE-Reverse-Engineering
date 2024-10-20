package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aioj implements adaf {
    final /* synthetic */ List a;
    private aiok b;

    public aioj(List list) {
        this.a = list;
    }

    @Override // defpackage.adaf
    public final void a() {
        this.b = new aiok();
    }

    @Override // defpackage.adaf
    public final void b(byte[] bArr) {
        aiok aiokVar = this.b;
        if (aiokVar != null) {
            aiokVar.a = bArr;
        }
    }

    @Override // defpackage.adaf
    public final void c() {
        aiok aiokVar = this.b;
        if (aiokVar != null) {
            this.a.add(aiokVar);
        }
        this.b = null;
    }

    @Override // defpackage.adaf
    public final void d(adxq adxqVar) {
        aiok aiokVar = this.b;
        if (aiokVar != null) {
            if (((String) adxqVar.a).equalsIgnoreCase(assi.a)) {
                aiokVar.b = (String) adxqVar.b;
                return;
            }
            if (((String) adxqVar.a).equalsIgnoreCase("Content-ID")) {
                aiokVar.d = ((String) adxqVar.b).substring(1, r4.length() - 1);
                return;
            } else {
                if (((String) adxqVar.a).equalsIgnoreCase(assi.c)) {
                    aiokVar.c = (String) adxqVar.b;
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("Part is null");
    }
}
