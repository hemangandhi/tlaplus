with import <nixpkgs> {};

stdenv.mkDerivation rec {
  name = "rust-env";
#  programs.java.enable = true;
#  programs.java.package = pkgs.adoptopenjdk-bin;
  buildInputs = [
    pkgs.eclipses.eclipse-platform
  ];
}
