def newGit(branch,repo)
{
   git branch: "${branch}", url: "${repo}"
}
def newMaven()
{
   sh "mvn clean package"
}
