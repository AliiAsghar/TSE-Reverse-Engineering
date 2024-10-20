package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahwc implements Externalizable {
    private static final long serialVersionUID = 1;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean G;
    private boolean H;
    private boolean J;
    private boolean L;
    private boolean N;
    private boolean P;
    private boolean R;
    private boolean T;
    private boolean V;
    private boolean W;
    private boolean Z;
    public boolean o;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;
    public ahwe a = null;
    public ahwe b = null;
    public ahwe c = null;
    public ahwe d = null;
    public ahwe e = null;
    public ahwe f = null;
    public ahwe g = null;
    public ahwe h = null;
    public ahwe i = null;
    public ahwe j = null;
    private ahwe F = null;
    public ahwe k = null;
    private ahwe I = null;
    private ahwe K = null;
    private ahwe M = null;
    private ahwe O = null;
    private ahwe Q = null;
    public String l = "";
    public int m = 0;
    public String n = "";
    private String S = "";
    private String U = "";
    public String p = "";
    public String q = "";
    public String r = "";
    private boolean X = false;
    public final List s = new ArrayList();
    public final List t = new ArrayList();
    private boolean Y = false;
    private String aa = "";
    private boolean ab = false;

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            ahwe ahweVar = new ahwe();
            ahweVar.readExternal(objectInput);
            this.u = true;
            this.a = ahweVar;
        }
        if (objectInput.readBoolean()) {
            ahwe ahweVar2 = new ahwe();
            ahweVar2.readExternal(objectInput);
            this.v = true;
            this.b = ahweVar2;
        }
        if (objectInput.readBoolean()) {
            ahwe ahweVar3 = new ahwe();
            ahweVar3.readExternal(objectInput);
            this.w = true;
            this.c = ahweVar3;
        }
        if (objectInput.readBoolean()) {
            ahwe ahweVar4 = new ahwe();
            ahweVar4.readExternal(objectInput);
            this.x = true;
            this.d = ahweVar4;
        }
        if (objectInput.readBoolean()) {
            ahwe ahweVar5 = new ahwe();
            ahweVar5.readExternal(objectInput);
            this.y = true;
            this.e = ahweVar5;
        }
        if (objectInput.readBoolean()) {
            ahwe ahweVar6 = new ahwe();
            ahweVar6.readExternal(objectInput);
            this.z = true;
            this.f = ahweVar6;
        }
        if (objectInput.readBoolean()) {
            ahwe ahweVar7 = new ahwe();
            ahweVar7.readExternal(objectInput);
            this.A = true;
            this.g = ahweVar7;
        }
        if (objectInput.readBoolean()) {
            ahwe ahweVar8 = new ahwe();
            ahweVar8.readExternal(objectInput);
            this.B = true;
            this.h = ahweVar8;
        }
        if (objectInput.readBoolean()) {
            ahwe ahweVar9 = new ahwe();
            ahweVar9.readExternal(objectInput);
            this.C = true;
            this.i = ahweVar9;
        }
        if (objectInput.readBoolean()) {
            ahwe ahweVar10 = new ahwe();
            ahweVar10.readExternal(objectInput);
            this.D = true;
            this.j = ahweVar10;
        }
        if (objectInput.readBoolean()) {
            ahwe ahweVar11 = new ahwe();
            ahweVar11.readExternal(objectInput);
            this.E = true;
            this.F = ahweVar11;
        }
        if (objectInput.readBoolean()) {
            ahwe ahweVar12 = new ahwe();
            ahweVar12.readExternal(objectInput);
            this.G = true;
            this.k = ahweVar12;
        }
        if (objectInput.readBoolean()) {
            ahwe ahweVar13 = new ahwe();
            ahweVar13.readExternal(objectInput);
            this.H = true;
            this.I = ahweVar13;
        }
        if (objectInput.readBoolean()) {
            ahwe ahweVar14 = new ahwe();
            ahweVar14.readExternal(objectInput);
            this.J = true;
            this.K = ahweVar14;
        }
        if (objectInput.readBoolean()) {
            ahwe ahweVar15 = new ahwe();
            ahweVar15.readExternal(objectInput);
            this.L = true;
            this.M = ahweVar15;
        }
        if (objectInput.readBoolean()) {
            ahwe ahweVar16 = new ahwe();
            ahweVar16.readExternal(objectInput);
            this.N = true;
            this.O = ahweVar16;
        }
        if (objectInput.readBoolean()) {
            ahwe ahweVar17 = new ahwe();
            ahweVar17.readExternal(objectInput);
            this.P = true;
            this.Q = ahweVar17;
        }
        this.l = objectInput.readUTF();
        this.m = objectInput.readInt();
        this.n = objectInput.readUTF();
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.R = true;
            this.S = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.T = true;
            this.U = readUTF2;
        }
        if (objectInput.readBoolean()) {
            String readUTF3 = objectInput.readUTF();
            this.o = true;
            this.p = readUTF3;
        }
        if (objectInput.readBoolean()) {
            String readUTF4 = objectInput.readUTF();
            this.V = true;
            this.q = readUTF4;
        }
        if (objectInput.readBoolean()) {
            String readUTF5 = objectInput.readUTF();
            this.W = true;
            this.r = readUTF5;
        }
        this.X = objectInput.readBoolean();
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            ahwb ahwbVar = new ahwb();
            ahwbVar.readExternal(objectInput);
            this.s.add(ahwbVar);
        }
        int readInt2 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            ahwb ahwbVar2 = new ahwb();
            ahwbVar2.readExternal(objectInput);
            this.t.add(ahwbVar2);
        }
        this.Y = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            String readUTF6 = objectInput.readUTF();
            this.Z = true;
            this.aa = readUTF6;
        }
        this.ab = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.u);
        if (this.u) {
            this.a.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.v);
        if (this.v) {
            this.b.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.w);
        if (this.w) {
            this.c.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.x);
        if (this.x) {
            this.d.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.y);
        if (this.y) {
            this.e.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.z);
        if (this.z) {
            this.f.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A);
        if (this.A) {
            this.g.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.B);
        if (this.B) {
            this.h.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.C);
        if (this.C) {
            this.i.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.D);
        if (this.D) {
            this.j.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.E);
        if (this.E) {
            this.F.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.G);
        if (this.G) {
            this.k.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.H);
        if (this.H) {
            this.I.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.J);
        if (this.J) {
            this.K.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.L);
        if (this.L) {
            this.M.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.N);
        if (this.N) {
            this.O.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.P);
        if (this.P) {
            this.Q.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.l);
        objectOutput.writeInt(this.m);
        objectOutput.writeUTF(this.n);
        objectOutput.writeBoolean(this.R);
        if (this.R) {
            objectOutput.writeUTF(this.S);
        }
        objectOutput.writeBoolean(this.T);
        if (this.T) {
            objectOutput.writeUTF(this.U);
        }
        objectOutput.writeBoolean(this.o);
        if (this.o) {
            objectOutput.writeUTF(this.p);
        }
        objectOutput.writeBoolean(this.V);
        if (this.V) {
            objectOutput.writeUTF(this.q);
        }
        objectOutput.writeBoolean(this.W);
        if (this.W) {
            objectOutput.writeUTF(this.r);
        }
        objectOutput.writeBoolean(this.X);
        int size = this.s.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((ahwb) this.s.get(i)).writeExternal(objectOutput);
        }
        int size2 = this.t.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            ((ahwb) this.t.get(i2)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.Y);
        objectOutput.writeBoolean(this.Z);
        if (this.Z) {
            objectOutput.writeUTF(this.aa);
        }
        objectOutput.writeBoolean(this.ab);
    }
}
